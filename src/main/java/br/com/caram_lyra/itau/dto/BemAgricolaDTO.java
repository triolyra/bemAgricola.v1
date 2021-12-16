package br.com.caram_lyra.itau.dto;

import java.util.Date;

import br.com.caram_lyra.itau.domain.BemAgricola;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BemAgricolaDTO {

	private long idBem;
	
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
	
	public BemAgricolaDTO(BemAgricola bemAgricola) {
		this.idBem = bemAgricola.getIdBem();
		this.idTipoBem = bemAgricola.getIdTipoBem();
		this.funcional = bemAgricola.getFuncional();
		this.safra = bemAgricola.getSafra();
		this.quantidade = bemAgricola.getQuantidade();
		this.colheitaRealizada = bemAgricola.isColheitaRealizada();
		this.unidadeMedida = bemAgricola.getUnidadeMedida();
		this.tipoMoeda = bemAgricola.getTipoMoeda();
		this.valor = bemAgricola.getValor();
		this.dataInclusao = bemAgricola.getDataInclusao();
		this.dataAvaliacao = bemAgricola.getDataAvaliacao();
		
	}

}
