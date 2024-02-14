package estoque.estoque.controller;

import estoque.estoque.clientes.ClienteRepository;
import estoque.estoque.clientes.Clientes;
import estoque.estoque.clientes.DadosCadastroCliente;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Clientes> listar() {
        return repository.findAll();
    }
}
