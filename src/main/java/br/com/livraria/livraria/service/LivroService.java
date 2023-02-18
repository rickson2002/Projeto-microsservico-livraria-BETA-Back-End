package br.com.livraria.livraria.service;

import java.util.List;
import java.util.Optional;


import br.com.livraria.livraria.model.Livro;


public interface LivroService {
    List<Livro> obterTodos();
    Optional<Livro> obterLivroPorId(String id);
    void excluirPorId(String id);
    Livro cadastrar(Livro livro);
    Livro atualizarPorId(String id, Livro livro); 
}
