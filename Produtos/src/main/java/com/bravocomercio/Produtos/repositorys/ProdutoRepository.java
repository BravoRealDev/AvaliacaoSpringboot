package com.bravocomercio.Produtos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bravocomercio.Produtos.models.produto;

public interface ProdutoRepository extends JpaRepository<produto, Long> {   
    
}
