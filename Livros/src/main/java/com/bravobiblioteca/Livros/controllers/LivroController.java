package com.bravobiblioteca.Livros.controllers;

import com.bravobiblioteca.Livros.models.Livro;
import com.bravobiblioteca.Livros.services.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;


@RestController

@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @PostMapping
    public Livro adicionarLivro(@RequestBody Livro livro) {
        return livroService.adicionarLivro(livro);
    }
    @GetMapping
    public List<Livro> listarLivros() {
        return livroService.listarLivros();
    }

    @GetMapping("/{id}")
    public Livro obterLivroPorId(@PathVariable Long id) {
        return livroService.obterLivroPorId(id);
    }

    @PutMapping("/{id}")
    public Livro atualizarLivro(@PathVariable Long id, @RequestBody Livro livro) {
        livro.setId(id);
        return livroService.atualizarLivro(id, livro);
    }

    @DeleteMapping("/{id}")
    public void excluirLivro(@PathVariable Long id) {
        livroService.excluirLivro(id);
    }

    @PatchMapping("/{id}/emprestar")
    public Livro emprestarLivro(@PathVariable Long id) {
        return livroService.emprestarLivro(id);
    }

    @PatchMapping("/{id}/devolver")
    public Livro devolverLivro(@PathVariable Long id) {
        return livroService.devolverLivro(id);
    }

}
