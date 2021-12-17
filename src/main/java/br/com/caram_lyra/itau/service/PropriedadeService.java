package br.com.caram_lyra.itau.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caram_lyra.itau.domain.Propriedade;
import br.com.caram_lyra.itau.repository.PropriedadeRepository;
import br.com.caram_lyra.itau.usecase.CadastrarUseCase;

@Service
public class PropriedadeService {

	@Autowired
	private PropriedadeRepository propriedadeRepository;

	@Autowired
	private CadastrarUseCase cadastrarUseCase;

	public Propriedade cadastrarPropriedade(Propriedade propriedade) {
		if (cadastrarUseCase.cadastrarPropriedade(propriedade)) {
			return null;
		} else {
			propriedadeRepository.save(propriedade);

			return propriedade;
		}
	}
  

}
	