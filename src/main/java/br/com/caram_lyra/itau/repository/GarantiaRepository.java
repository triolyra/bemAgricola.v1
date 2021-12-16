package br.com.caram_lyra.itau.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.caram_lyra.itau.domain.Garantia;

@Repository
public interface GarantiaRepository extends JpaRepository<Garantia, Long>{
	
	public Optional<Garantia> findByCodigoGarantia(long codigoGarantia);
}
