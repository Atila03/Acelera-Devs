package estoque.estoque.estoque;


import estoque.estoque.produtos.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

    }

