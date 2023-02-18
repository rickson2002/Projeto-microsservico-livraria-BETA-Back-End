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
//import br.com.livraria.livraria.repository.LivroRepository;
import br.com.livraria.livraria.service.LivroService;

@RestController
@RequestMapping("/prateleira")
public class LivroController {
@Autowired
private LivroService servico;


@PostMapping
public Livro cadastrarLivro(@RequestBody Livro livro){
    return servico.cadastrar(livro);

    }
@GetMapping
public List<Livro> obterPrateleira(){
    return servico.obterTodos();
}

@GetMapping("/{id}")
public Optional<Livro> obterLivro(@PathVariable String id){
    return servico.obterLivroPorId(id);

}

@DeleteMapping("/{id}")
public void excluirLivro(@PathVariable String id){
    servico.excluirPorId(id);

    }    


@PutMapping("/{id}")
public Livro atualizarLivro(@PathVariable String id,@RequestBody Livro livro){
    return servico.atualizarPorId(id, livro);

     }


}
