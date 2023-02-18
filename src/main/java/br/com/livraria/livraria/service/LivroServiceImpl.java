package br.com.livraria.livraria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livraria.livraria.model.Livro;
import br.com.livraria.livraria.repository.LivroRepository;

@Service
public class LivroServiceImpl implements LivroService{

    @Autowired
    private LivroRepository repositorio;


    @Override
    public Optional<Livro> obterLivroPorId(String id) {
        return repositorio.findById(id);
    }


    @Override
    public void excluirPorId(String id) {
        repositorio.deleteById(id);
    }


    @Override
    public List<Livro> obterTodos() {
        return repositorio.findAll();
    }


    @Override
    public Livro cadastrar(Livro livro) {
        return repositorio.save(livro);
    }


    @Override
    public Livro atualizarPorId(String id, Livro livro) {
        livro.setId(id);
        return repositorio.save(livro);
    }
    


}


