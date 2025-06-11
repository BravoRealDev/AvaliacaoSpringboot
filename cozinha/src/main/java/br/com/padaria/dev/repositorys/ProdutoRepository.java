package br.com.padaria.dev.repositorys;

import br.com.padaria.dev.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends
        JpaRepository<Produto,Long> {
}
