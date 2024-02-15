package estoque.estoque.controller;


import estoque.estoque.clientes.DadosAtualizacaoCliente;
import estoque.estoque.clientes.DadosListagemCliente;
import estoque.estoque.produtos.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroProduto registro) {
        repository.save(new Produtos(registro));
    }

    @GetMapping
    public Page<DadosListagemProdutos> listar(@PageableDefault(page = 0, size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemProdutos::new);

    }
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoProduto registro) {
        var produto  = repository.getReferenceById(registro.id());
        produto.atualizarInformacoes(registro);
    }
}