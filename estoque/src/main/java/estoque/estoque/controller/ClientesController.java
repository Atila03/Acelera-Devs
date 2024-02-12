package estoque.estoque.controller;

import estoque.estoque.clientes.DadosCadastroCliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClientesController {

    @PostMapping
    public void  cadastrar(@RequestBody DadosCadastroCliente dados) {
        System.out.println(dados);



    }


}
