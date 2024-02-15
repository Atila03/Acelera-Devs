package estoque.estoque.clientes;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(
        @NotNull
        Long id,
        String nome,
        String cpf,
        String cep){
}
