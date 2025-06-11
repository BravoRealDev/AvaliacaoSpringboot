package com.bravobiblioteca.Livros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bravobiblioteca.Livros.models.Livro;

public interface LivroRepository  extends JpaRepository<Livro, Long> {

   
    List<Livro> findByAutor(String autor);

}
