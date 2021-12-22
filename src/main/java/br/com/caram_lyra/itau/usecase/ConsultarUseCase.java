package br.com.caram_lyra.itau.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.caram_lyra.itau.domain.BemAgricola;
import br.com.caram_lyra.itau.repository.BemAgricolaRepository;

@Component
public class ConsultarUseCase {
	
	@Autowired
	private BemAgricolaRepository bemAgricolaRepository;
	
	public BemAgricola consultarUseCase(long codigoBem) {
		Optional<BemAgricola> bemAgricola = bemAgricolaRepository.findByCodigoBem(codigoBem);
		if (bemAgricola.isPresent()) {
			return bemAgricola.get();
		} else {
			return null;
	}
}
	
	

}
