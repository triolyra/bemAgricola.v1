package br.com.caram_lyra.itau.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_garantia")
@Data
public class Garantia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigoGarantia;
	
	private long codigoTipoGarantiaInstrumento; //vai ser do tipo penhor
	
	@OneToMany (mappedBy= "garantia")
	private List <BemAgricola> bemAgricola;//uma garantia possui um ou mais bens, o que é penhorado é um produto do tipo agrícola
	
	//produto
}
