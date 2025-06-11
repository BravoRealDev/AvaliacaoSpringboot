package com.bravobiblioteca.Livros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bravobiblioteca.Livros.models.Livro;
import com.bravobiblioteca.Livros.repository.LivroRepository;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    public Livro buscarLivroPorId(Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    public Livro salvarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public void excluirLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public Livro atualizarLivro(Long id, Livro livroAtualizado) {
        return livroRepository.save(livroAtualizado);       
    }

    public Livro cadastrarLivro(Livro livro) {
        livro.setDisponivel(true);
        return livroRepository.save(livro);
    }

    public Livro emprestarLivro(Long id) {
        Livro livro = livroRepository.findById(id).orElseThrow(new RuntimeException("Livro não encontrado"));
    }

    public Livro devolverLivro(Long id) {
        Livro livro = livroRepository.findById(id).orElseThrow(new RuntimeException("Livro não encontrado"));
        livro.setDisponivel(true);
        return livroRepository.save(livro);
    }
  


}
