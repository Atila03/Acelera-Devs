package estoque.estoque.estoque;

import jakarta.validation.constraints.NotBlank;


    public record DadosCadastroEstoque (

            String nome,

            float preco,

            int quantidade,

            String vencimento) {

    }

