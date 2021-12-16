package br.com.caram_lyra.itau.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.caram_lyra.itau.domain.BemAgricola;
import br.com.caram_lyra.itau.repository.BemAgricolaRepository;

@Component
public class CadastrarBemAgricolaUseCase {
	
	@Autowired
	private BemAgricolaRepository bemAgricolaRepository;
	
	public boolean cadastrarBemAgricola(BemAgricola bemAgricola) {
		if (bemAgricolaRepository.findByCodigoBem(bemAgricola.getCodigoBem()).isEmpty()) {
			return false;
		} else {
			return true;
		}
		
	}
}
