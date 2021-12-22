package br.com.caram_lyra.itau.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_propriedade")
@Data
public class Propriedade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigoPropriedade;
	
	private String nome;
	private String endereco;
	private String bairro;
	private int cep;
	private int numero;
	private String complemento;
	private String cidade;
	private String UF;
	
	@ManyToOne
	@JoinColumn(name= "codigoBem")
	private BemAgricola bemAgricola; //a propriedade é atrelada a um bem
	
}
  