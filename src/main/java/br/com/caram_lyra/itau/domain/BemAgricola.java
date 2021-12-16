package br.com.caram_lyra.itau.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_bemAgricola")
@Data
public class BemAgricola {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idBem;
	private String contrato;
	private long idTipoBem;
	private String funcional;
	private int safra;
	private String quantidade;
	private boolean colheitaRealizada;
	private String unidadeMedida;
	private String tipoMoeda;
	private double valor;
	private Date dataInclusao;
	private Date dataAvaliacao;
}
