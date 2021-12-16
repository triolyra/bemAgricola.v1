package br.com.caram_lyra.itau.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_operacao")
@Data
public class Operacao {

	private long produto;
	private long contrato;
	private int agencia;
	private int conta;
	private int cpf;
	private Date DataAbertura;
	private Date DataVencimento;
	//private double valor;
}
