package estoque.estoque.clientes;

public record DadosListagemCliente(Long id, String nome, String cep, String cpf) {

    public DadosListagemCliente(Clientes cliente) {
        this(cliente.getId(), cliente.getNome(), cliente.getCep(), cliente.getCpf());
    }

}