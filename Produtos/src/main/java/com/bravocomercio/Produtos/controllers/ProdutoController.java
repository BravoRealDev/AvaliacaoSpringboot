package com.bravocomercio.Produtos.controllers;

import com.bravocomercio.Produtos.models.produto;
import com.bravocomercio.Produtos.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<produto> listarTodos() {
        return produtoService.listarTodos();
    }

    @GetMapping("/{id}")
    public produto buscarPorId(@PathVariable Long id) {
        return produtoService.buscarPorId(id);
    }

    @PostMapping
    public produto salvar(@RequestBody produto produto) {
        return produtoService.salvar(produto);
    }

    @PutMapping("/{id}")
    public produto atualizar(@PathVariable Long id, @RequestBody produto produto) {
        produto.setId(id);
        return produtoService.atualizar(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        produtoService.deletar(id);
    }

}
