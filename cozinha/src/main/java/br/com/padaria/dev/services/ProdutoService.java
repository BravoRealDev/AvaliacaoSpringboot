package br.com.padaria.dev.services;

import br.com.padaria.dev.models.Produto;
import br.com.padaria.dev.repositorys.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listarTodos(){
        return repository.findAll();
    }

    public Produto buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    public Produto atualizar(Produto produto){
        return repository.save(produto);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }






}
