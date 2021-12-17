package br.com.caram_lyra.itau.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caram_lyra.itau.domain.Propriedade;
import br.com.caram_lyra.itau.repository.PropriedadeRepository;
import br.com.caram_lyra.itau.usecase.CadastrarUseCase;

@Service
public class PropriedadesService {

	@Autowired
	private PropriedadeRepository propriedadeRepository;

	@Autowired
	private CadastrarUseCase cadastrarUseCase;

	public Propriedade incluirPropriedade(Propriedade propriedade) {
		if (cadastrarUseCase.incluirPropriedade(propriedade)) {
			return null;
		} else {
			propriedadeRepository.save(propriedade);

			return propriedade;
		}
	}


}
	
	


