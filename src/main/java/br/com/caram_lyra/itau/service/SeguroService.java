package br.com.caram_lyra.itau.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caram_lyra.itau.domain.Seguro;
import br.com.caram_lyra.itau.repository.SeguroRepository;
import br.com.caram_lyra.itau.usecase.CadastrarUseCase;

@Service
public class SeguroService {

	@Autowired
	private SeguroRepository seguroRepository;

	@Autowired
	private CadastrarUseCase cadastrarUseCase;

	public Seguro cadastrarSeguro(Seguro seguro) {
		if (cadastrarUseCase.cadastrarSeguro(seguro)) {
			return null;
		} else {
			seguroRepository.save(seguro);

			return seguro;
		}

	}
}