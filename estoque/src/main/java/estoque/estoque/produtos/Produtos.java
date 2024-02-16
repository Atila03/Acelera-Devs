package estoque.estoque.produtos;


import estoque.estoque.clientes.DadosAtualizacaoCliente;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "produtos")
@Entity(name = "Produto")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produtos {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private long codigo;
    private String nome;
    private float preco;

    private Boolean ativo;
    public Produtos(DadosCadastroProduto registro) {
        this.ativo = true;
        this.nome = registro.nome();
        this.codigo = registro.codigo();
        this.preco = registro.preco();
    }
    public void atualizarInformacoes(DadosAtualizacaoProduto registro) {
        if (registro.nome() != null) {
            this.nome = registro.nome();
        }
        if (registro.codigo() != null) {
            this.codigo = registro.codigo();
        }
        if (registro.preco() != null) {
            this.preco = registro.preco();
        }
    }

      public void excluir() {
        this.ativo = false;
    }
}
