package estoque.estoque.produtos;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoProduto(
        @NotNull
        Long id,
        String nome,
        Long codigo,
        Float preco){
}
