package estoque.estoque.clientes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCliente (
        @NotBlank
        String nome,
        @NotBlank
        String nascimento,
        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String cpf,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep) {

}