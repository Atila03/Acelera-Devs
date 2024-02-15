package estoque.estoque.produtos;



public record DadosListagemProdutos(Long id, Long codigo, String nome, Float preco) {

    public DadosListagemProdutos(Produtos produto){
      this(produto.getId(), produto.getCodigo(), produto.getNome(), produto.getPreco());

    }
}

