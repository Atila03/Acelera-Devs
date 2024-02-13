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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String cep;

    public Clientes(DadosCadastroCliente dados) {
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        this.cpf = dados.cpf();
        this.cep = dados.cep();
    }
}