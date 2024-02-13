package estoque.estoque.controller;

import estoque.estoque.clientes.ClienteRepository;
import estoque.estoque.clientes.Clientes;
import estoque.estoque.clientes.DadosCadastroCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    public void  cadastrar(@RequestBody DadosCadastroCliente dados) {
        repository.save(new Clientes(dados));
    }


}
