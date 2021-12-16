package br.com.caram_lyra.itau.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.caram_lyra.itau.domain.BemAgricola;
import br.com.caram_lyra.itau.domain.Garantia;
import br.com.caram_lyra.itau.repository.BemAgricolaRepository;
import br.com.caram_lyra.itau.repository.GarantiaRepository;

@Component
public class CadastrarUseCase {

	@Autowired
	private BemAgricolaRepository bemAgricolaRepository;
	
	@Autowired
	private GarantiaRepository garantiaRepository;

		public boolean incluirBemAgricola(BemAgricola bemAgricola) {
			if (bemAgricolaRepository.findByCodigoBem(bemAgricola.getCodigoBem()).isEmpty()) {
				return false;
			} else {
				return true;
			}
		}
		
		public boolean incluirGarantia(Garantia garantia) {
			if (garantiaRepository.findByCodigoGarantia(garantia.getCodigoGarantia()).isEmpty()) {
				return false;
			} else {
				return true;
			}
		}
}