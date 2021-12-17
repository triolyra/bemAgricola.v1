package br.com.caram_lyra.itau.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caram_lyra.itau.domain.BemAgricola;
import br.com.caram_lyra.itau.repository.BemAgricolaRepository;
import br.com.caram_lyra.itau.usecase.CadastrarUseCase;

@Service
public class BemAgricolaService {
	
	@Autowired
	private BemAgricolaRepository bemAgricolaRepository;
	
	@Autowired
	private CadastrarUseCase cadastrarUseCase;
	
	public BemAgricola cadastrarBemAgricola(BemAgricola bemAgricola) {
		if (cadastrarUseCase.cadastrarBemAgricola(bemAgricola)) {
			return null;
		} else {
			bemAgricolaRepository.save(bemAgricola);
			return bemAgricola;
		}
	}
	
	public BemAgricola consultarBemAgricola(BemAgricola bemAgricola) {
		return bemAgricola;
	}
}