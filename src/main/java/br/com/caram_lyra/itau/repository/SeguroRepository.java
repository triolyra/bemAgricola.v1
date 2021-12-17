package br.com.caram_lyra.itau.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.caram_lyra.itau.domain.Seguro;

@Repository
public interface SeguroRepository extends JpaRepository<Seguro, Long>{

	public Optional<Seguro> findByCodigoSeguro(long codigoSeguro);


}
