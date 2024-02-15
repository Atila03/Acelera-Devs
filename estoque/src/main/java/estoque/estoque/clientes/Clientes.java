package estoque.estoque.clientes;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "clientes")
@Entity(name = "Cliente")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String nascimento;
    private String cpf;
    private String cep;

    private Boolean ativo;
    public Clientes(DadosCadastroCliente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.nascimento = dados.nascimento();
        this.cpf = dados.cpf();
        this.cep = dados.cep();
    }

    public void atualizarInformacoes(DadosAtualizacaoCliente dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.cpf() != null) {
            this.cpf = dados.cpf();
        }
        if (dados.cep() != null) {
            this.cep = dados.cpf();
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}