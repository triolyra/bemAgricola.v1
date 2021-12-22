package br.com.caram_lyra.itau.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caram_lyra.itau.domain.BemAgricola;
import br.com.caram_lyra.itau.repository.BemAgricolaRepository;
import br.com.caram_lyra.itau.usecase.CadastrarUseCase;
import br.com.caram_lyra.itau.usecase.ConsultarUseCase;

@Service
public class BemAgricolaService {
	
	@Autowired
	private BemAgricolaRepository bemAgricolaRepository;
	
	@Autowired
	private CadastrarUseCase cadastrarUseCase;
	
	@Autowired
	private ConsultarUseCase consultarUseCase;
	
	public BemAgricola cadastrarBemAgricola(BemAgricola bemAgricola) {
		if (cadastrarUseCase.cadastrarBemAgricola(bemAgricola)) {
			return null;
		} else {
			bemAgricolaRepository.save(bemAgricola);
			return bemAgricola;
		}
	}
}
