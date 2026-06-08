package com.rest_springboot_course.loja;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto criar(Produto p) {
        return repository.save(p);
    }

    public List<Produto> deletar(int id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    public List<Produto> atualizar(int id, Produto p) {
        Optional<Produto> produtosOptional = repository.findById(id);

        if (produtosOptional.isPresent()) {
            Produto produto = produtosOptional.get();
            produto.setNome(p.getNome());
            produto.setPreco(p.getPreco());
            repository.save(produto);
        }
        return repository.findAll();
    }
}
