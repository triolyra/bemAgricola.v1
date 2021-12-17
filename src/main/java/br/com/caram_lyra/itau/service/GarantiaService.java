package br.com.caram_lyra.itau.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caram_lyra.itau.domain.Garantia;
import br.com.caram_lyra.itau.repository.GarantiaRepository;
import br.com.caram_lyra.itau.usecase.CadastrarUseCase;

public class GarantiaService {
	
	@Autowired
	private GarantiaRepository garantiaRepository;
	
	@Autowired
	private CadastrarUseCase cadastrarUseCase;

	public Garantia cadastrarGarantia(Garantia garantia) {
		if (cadastrarUseCase.cadastrarGarantia(garantia)) {
			return null;
		} else {
			garantiaRepository.save(garantia);
			return garantia;
		}
	}
}
