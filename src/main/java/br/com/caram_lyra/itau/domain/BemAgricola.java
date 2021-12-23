package br.com.caram_lyra.itau.domain;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne (cascade=CascadeType.PERSIST)
	private Propriedade propriedade; //bem possui uma ou mais propriedades

	 @OneToOne (mappedBy= "bemAgricola", cascade=CascadeType.PERSIST)
	private Seguro seguro; //bem possui um seguro atrelado
}
  
