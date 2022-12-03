package br.fepi.copaqatar.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Iremos adicionar o Entity para dizer que essa classe será salva no banco 
//Nossa classe é uma entidade do Jpa 
@Entity
@Data

//Geranado construtor com e sem parametro
@AllArgsConstructor
@NoArgsConstructor
public class Selecao {
	
	@Id
	//Mostrando que os Ids vão gerar de forma automática 
	//isso mostrará um autoincremento em nosso ID
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	//	Criando os atributos
	@JsonInclude(Include.NON_NULL)
	Long id; //Id das seleções 
	@JsonInclude(Include.NON_NULL)
	String nome;
	@JsonInclude(Include.NON_NULL)
	String cor_camisa_principal;
	@JsonInclude(Include.NON_NULL)
	String cor_camisa_secundaria;
	@JsonInclude(Include.NON_NULL)
	boolean favorita;
	@JsonInclude(Include.NON_NULL)
	int numero_copas;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor_camisa_principal() {
		return cor_camisa_principal;
	}
	public void setCor_camisa_principal(String cor_camisa_principal) {
		this.cor_camisa_principal = cor_camisa_principal;
	}
	public String getCor_camisa_secundaria() {
		return cor_camisa_secundaria;
	}
	public void setCor_camisa_secundaria(String cor_camisa_secundaria) {
		this.cor_camisa_secundaria = cor_camisa_secundaria;
	}
	public boolean isFavorita() {
		return favorita;
	}
	public void setFavorita(boolean favorita) {
		this.favorita = favorita;
	}
	public int getNumero_copas() {
		return numero_copas;
	}
	public void setNumero_copas(int numero_copas) {
		this.numero_copas = numero_copas;
	}
	
	
	public Selecao() {
		
	}
	
	
	
	
}
