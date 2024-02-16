package estoque.estoque.controller;



import estoque.estoque.clientes.DadosAtualizacaoCliente;
import estoque.estoque.clientes.DadosListagemCliente;
import estoque.estoque.estoque.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("estoque")
public class EstoqueController {
  @Autowired
    private EstoqueRepository repository;
    @PostMapping
    @Transactional
    public void  cadastrar(@RequestBody @Valid DadosCadastroEstoque armazem) {
        repository.save(new Estoque(armazem));
    }

  @GetMapping
  public Page<DadosListagemEstoque> listar(@PageableDefault(page = 0, size = 10, sort = {"nome"}) Pageable paginacao) {
    return repository.findAll(paginacao).map(DadosListagemEstoque::new);
  }
  @PutMapping
  @Transactional
  public void atualizar(@RequestBody @Valid DadosAtualizacaoEstoque armazem) {
    var estoque  = repository.getReferenceById(armazem.id());
    estoque.atualizarInformacoes(armazem);
  }
  @DeleteMapping("/{id}")
  @Transactional
  public void excluir(@PathVariable Long id) {
    var estoque  = repository.getReferenceById(id);
    estoque.excluir();

  }
}
