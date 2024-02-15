package estoque.estoque.controller;

import estoque.estoque.clientes.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClientesController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    public void  cadastrar(@RequestBody @Valid DadosCadastroCliente dados) {
        repository.save(new Clientes(dados));
    }

    @GetMapping
    public Page<DadosListagemCliente> listar(@PageableDefault(page = 0, size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemCliente::new);
    }
   @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoCliente dados) {
        var cliente  = repository.getReferenceById(dados.id());
                cliente.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var cliente  = repository.getReferenceById(id);
        cliente.excluir();

    }

}
