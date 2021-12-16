package br.com.caram_lyra.itau.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_bemAgricola")
@Data
public class BemAgricola {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigoBem;
	
	private String tipoBemAgricola;
	private String funcionalColaborador;
	private int safra;
	private String quantidade;
	private boolean colheitaRealizada;
	private String unidadeMedida;
	private String tipoMoeda;
	//private double valor;
	private Date dataInclusao;
	private Date dataAvaliacao;
	
	@ManyToOne
	@JoinColumn(name= "codigoGarantia")
	private Garantia garantia; //bem possui uma garantia
	
	@ManyToOne
	@JoinColumn(name= "codigoPessoa")
	private Pessoa pessoa; //bem possui uma pessoa dona da propriedade
	
	@OneToMany (mappedBy= "bemAgricola")
	private List <Propriedade> propriedade; //bem possui uma ou mais propriedades

	@OneToOne (mappedBy= "bemAgricola")
	private Seguro seguro; //bem possui um seguro atrelado
}
