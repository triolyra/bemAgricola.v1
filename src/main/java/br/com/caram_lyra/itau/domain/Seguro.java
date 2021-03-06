package br.com.caram_lyra.itau.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name = "tb_seguro")
@Data
public class Seguro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigoSeguro;
	
	private String numApolice;
	private long cnpjSeguradora;
	private Date dataInicio;
	private Date dataFimAvaliacao;

	@OneToOne (cascade=CascadeType.PERSIST)
	@JsonIgnoreProperties("propriedade")
	private BemAgricola bemAgricola; //o seguro é atrelado a um bem
	
}
