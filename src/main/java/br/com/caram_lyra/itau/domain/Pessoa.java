package br.com.caram_lyra.itau.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name = "tb_pessoa")
@Data
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigoPessoa;
	
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("pessoa")
	private List<BemAgricola> bemAgricola;

}
