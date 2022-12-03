package br.fepi.copaqatar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fepi.copaqatar.domain.Selecao;

public interface SelecaoRepository extends JpaRepository<Selecao, Long>{

	//Aqui colocamos que esta classe extende a JPA repository de seleção que possui o ID do tipo Long 
	/*
	 Após criarmos o Seleção.java estamos criando essa classe devido a SpringDataJPA permite
	 criar repositorios a partir das bases, agora criaremos um Controller
	 */
}
