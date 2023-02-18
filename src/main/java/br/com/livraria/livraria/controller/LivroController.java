package br.com.livraria.livraria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.livraria.livraria.model.Livro;
import br.com.livraria.livraria.repository.LivroRepository;

@RestController
@RequestMapping("/prateleira")
public class LivroController {

@Autowired
private LivroRepository repositorio;


@PostMapping
public Livro cadastrarLivro(@RequestBody Livro livro){
    return repositorio.save(livro);

    }
@GetMapping
public List<Livro> obterPrateleira(){
    return repositorio.findAll();

}

@GetMapping("/{id}")
public Optional<Livro> obterLivro(@PathVariable String id){
    return repositorio.findById(id);

}

@DeleteMapping("/{id}")
public void excluirLivro(@PathVariable String id){
repositorio.deleteById(id);

    }    


@PutMapping("/{id}")
public Livro atualizarLivro(@PathVariable String id,@RequestBody Livro livro){
livro.setId(id);
return repositorio.save(livro);

     }


}
