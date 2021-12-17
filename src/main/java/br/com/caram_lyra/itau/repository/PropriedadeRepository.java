package br.com.caram_lyra.itau.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.caram_lyra.itau.domain.Propriedade;

@Repository
public interface PropriedadeRepository extends JpaRepository<Propriedade, Long>{
	
	public Optional<Propriedade> findByCodigoPropriedade(long codigoPropriedade);
}