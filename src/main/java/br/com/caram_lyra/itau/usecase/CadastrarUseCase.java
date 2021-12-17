package br.com.caram_lyra.itau.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.caram_lyra.itau.domain.BemAgricola;
import br.com.caram_lyra.itau.domain.Garantia;
import br.com.caram_lyra.itau.domain.Pessoa;
import br.com.caram_lyra.itau.domain.Seguro;
import br.com.caram_lyra.itau.repository.BemAgricolaRepository;
import br.com.caram_lyra.itau.repository.GarantiaRepository;
import br.com.caram_lyra.itau.repository.PessoaRepository;
import br.com.caram_lyra.itau.repository.SeguroRepository;

@Component
public class CadastrarUseCase {

	@Autowired
	private BemAgricolaRepository bemAgricolaRepository;
	
	@Autowired
	private GarantiaRepository garantiaRepository;
	
	@Autowired
	private SeguroRepository seguroRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;

		public boolean cadastrarBemAgricola(BemAgricola bemAgricola) {
			if (bemAgricolaRepository.findByCodigoBem(bemAgricola.getCodigoBem()).isEmpty()) {
				return false;
			} else {
				return true;
			}
		}
		
		public boolean cadastrarGarantia(Garantia garantia) {
			if (garantiaRepository.findByCodigoGarantia(garantia.getCodigoGarantia()).isEmpty()) {
				return false;
			} else {
				return true;
			}
		}
		
		public boolean cadastrarSeguro(Seguro seguro) {
			if (seguroRepository.findByCodigoSeguro(seguro.getCodigoSeguro()).isEmpty()) {
				return false;
			} else {
				return true;
			}
		}

		public boolean cadastrarPessoa(Pessoa pessoa) {
			if (pessoaRepository.findByCodigoPessoa(pessoa.getCodigoPessoa()).isEmpty()) {
				return false;
			} else {
				return true;
			}
		}
	}
