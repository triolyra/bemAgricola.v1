package br.com.caram_lyra.itau.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caram_lyra.itau.domain.Pessoa;
import br.com.caram_lyra.itau.repository.PessoaRepository;
import br.com.caram_lyra.itau.usecase.CadastrarUseCase;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private CadastrarUseCase cadastrarUseCase;

	public Pessoa cadastrarPessoa(Pessoa pessoa) {
		if (cadastrarUseCase.cadastrarPessoa(pessoa)) {
			return null;
		} else {
			pessoaRepository.save(pessoa);

			return pessoa;
		}
	}
}