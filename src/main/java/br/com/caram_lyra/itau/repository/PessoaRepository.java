package br.com.caram_lyra.itau.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caram_lyra.itau.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
	public Optional<Pessoa> findByCodigoPessoa(long codigoPessoa);
}

