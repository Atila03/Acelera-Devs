package estoque.estoque.estoque;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoEstoque (@NotNull Long id, String nome, Float preco, Integer quantidade, String vencimento) {

}
