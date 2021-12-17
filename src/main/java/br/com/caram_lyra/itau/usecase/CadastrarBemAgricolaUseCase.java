package br.com.caram_lyra.itau.usecase;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import br.com.caram_lyra.itau.domain.BemAgricola;
import br.com.caram_lyra.itau.domain.Pessoa;
import br.com.caram_lyra.itau.domain.Propriedade;
import br.com.caram_lyra.itau.domain.Seguro;
import br.com.caram_lyra.itau.repository.BemAgricolaRepository;
import br.com.caram_lyra.itau.repository.PessoaRepository;
import br.com.caram_lyra.itau.repository.PropriedadeRepository;
import br.com.caram_lyra.itau.repository.SeguroRepository;

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

	@Autowired
	private SeguroRepository seguroRepository;

	public boolean cadastrarSeguro(Seguro seguro) {
		if (seguroRepository.findByCodigoSeguro(seguro.getCodigoSeguro()).isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	@Autowired
	private PessoaRepository pessoaRepository;

	public boolean cadastrarPessoa(Pessoa pessoa) {
		if (pessoaRepository.findByCodigoPessoa(pessoa.getCodigoPessoa()).isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	@Autowired
	private PropriedadeRepository propriedadeRepository;

	public boolean incluirPropriedade(Propriedade propriedade) {
		if (propriedadeRepository.findByCodigoPropriedade(propriedade.getCodigoPropriedade()).isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}
