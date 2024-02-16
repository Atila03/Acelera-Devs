package estoque.estoque.estoque;


import estoque.estoque.clientes.DadosAtualizacaoCliente;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Table(name = "estoque")
@Entity(name = "Estoque")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Estoque {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private float preco;
    private int quantidade;
    private String vencimento;


    private Boolean ativo;

    public Estoque(DadosCadastroEstoque armazem) {
        this.ativo = true;
        this.nome = armazem.nome();
        this.preco = armazem.preco();
        this.quantidade = armazem.quantidade();
        this.vencimento = armazem.vencimento();
    }

    public void atualizarInformacoes(DadosAtualizacaoEstoque armazem) {
        if (armazem.nome() != null) {
            this.nome = armazem.nome();
        }
        if (armazem.preco() != null) {
            this.preco = armazem.preco();
        }
        if (armazem.quantidade() != null) {
            this.quantidade = armazem.quantidade();
        }
        if (armazem.vencimento() != null) {
            this.vencimento = armazem.vencimento();
        }
    }

    public void excluir() {this.ativo = false;}
}
