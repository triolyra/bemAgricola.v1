package br.com.caram_lyra.itau.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.caram_lyra.itau.domain.BemAgricola;

@Repository
public interface BemAgricolaRepository extends JpaRepository<BemAgricola, Long>{
	
	public Optional<BemAgricola> findByCodigoBem(long codigoBem);
	
	public List<BemAgricola> findAllBemAgricola(BemAgricola bemAgricola);
}
