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

	private long codigoBem;
	private String tipoBemAgricola;
	private String funcionalColaborador;
	private int safra;
	private String quantidade;
	private boolean colheitaRealizada;
	private String unidadeMedida;
	private String tipoMoeda;
	private double valor;
	private Date dataInclusao;
	private Date dataAvaliacao;
	
	public BemAgricolaDTO(BemAgricola bemAgricola) {
		this.codigoBem = bemAgricola.getCodigoBem();
		this.tipoBemAgricola = bemAgricola.getTipoBemAgricola();
		this.funcionalColaborador = bemAgricola.getFuncionalColaborador();
		this.safra = bemAgricola.getSafra();
		this.quantidade = bemAgricola.getQuantidade();
		this.colheitaRealizada = bemAgricola.isColheitaRealizada();
		this.unidadeMedida = bemAgricola.getUnidadeMedida();
		this.tipoMoeda = bemAgricola.getTipoMoeda();
		//this.valor = bemAgricola.getValor();
		this.dataInclusao = bemAgricola.getDataInclusao();
		this.dataAvaliacao = bemAgricola.getDataAvaliacao();
		
	}

}
