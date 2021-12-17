package br.com.caram_lyra.itau.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caram_lyra.itau.domain.Seguro;
import br.com.caram_lyra.itau.repository.SeguroRepository;
import br.com.caram_lyra.itau.usecase.CadastrarBemAgricolaUseCase;

@Service
public class SeguroService {

	@Autowired
	private SeguroRepository seguroRepository;

	@Autowired
	private CadastrarBemAgricolaUseCase cadastrarBemAgricolaUseCase;

	public Seguro cadastrarSeguro(Seguro seguro) {
		if (cadastrarBemAgricolaUseCase.cadastrarSeguro(seguro)) {
			return null;
		} else {
			seguroRepository.save(seguro);

			return seguro;
		}

	}
}