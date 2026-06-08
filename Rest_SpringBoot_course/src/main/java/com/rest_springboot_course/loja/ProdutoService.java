package com.rest_springboot_course.loja;

import java.util.List;

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

    public List<Produto> deletar(int p) {
        repository.deleteById(p);
        return repository.findAll();
    }
}
