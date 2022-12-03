package br.fepi.copaqatar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.copaqatar.domain.Selecao;
import br.fepi.copaqatar.repository.SelecaoRepository;
import lombok.AllArgsConstructor;

/*
 Adicionando um Rest Controller que é um Controller do Spring MVC que irá pegar os dados 
 do Response Body permitindo que não precisamos criar telas ou renderizações de telas
 
 */
@RestController
//Importaremos pelo Lombock o construtor com todos os argumentos da nossa classe repositório
//Fazendo isso estaremos injetando nosso repositório 
@AllArgsConstructor
public class SelecaoController {
		/*
		 Queremos fazer um mapeamento da selação que, quando dermos get em Seleção será retornado
		 a lista de seleções, estaremos também importando os Repositórios da seleção pois
		 é naquela classe que terão as seleções  
		 */
	
		@Autowired
		SelecaoRepository repository;
	
	@GetMapping("/selecao")
	public List<Selecao> getAllSelecoes(){ //Aqui criamos um método para mostrar as seleções 
		
		return repository.findAll();
	}
	
	//Se quisermos buscar uma seleção por ID utilizamo 
	
	@GetMapping ("/selecao/{id}")
	public Selecao getSelecaoById(@PathVariable Long id ) {
		return repository.findById(id).get();
	}
	
	
	
	//Agora iremos adicionar uma nova seleção
	@PostMapping("/selecao" )    //Esse parametro de seleção virá lá do HTTP que virá no formato JSON
	public Selecao saveSelecao(@RequestBody Selecao selecao ) {
		//Agora só temos que mandar o repository salvar essa seleção
		
		return repository.save(selecao);
	}
	
	//Agora vamos atualizar a seleção selecionada pelo ID 
	@RequestMapping(value = "/selecao/{id}", method = RequestMethod.PUT)
	public void updateSelecao(@RequestBody Selecao selecao, @PathVariable("id") Long id) {
		
		selecao.setId(id);
		repository.save(selecao);
	}
	
	
	
	
	//Deletando seleção pelo ID
	@DeleteMapping("/selecao/{id}")
	public void dleteSelecaoById(@PathVariable Long id ) {
		 repository.deleteById(id);
	}
	
}
