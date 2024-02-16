package estoque.estoque.estoque;



public record DadosListagemEstoque (Long id, String nome, Float preco, Integer quantidade, String vencimento){
    public DadosListagemEstoque (Estoque estoque){

        this(estoque.getId(), estoque.getNome(), estoque.getPreco(), estoque.getQuantidade(), estoque.getVencimento());



    }


}
