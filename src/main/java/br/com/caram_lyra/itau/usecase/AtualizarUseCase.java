package br.com.caram_lyra.itau.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caram_lyra.itau.domain.Propriedade;
import br.com.caram_lyra.itau.repository.PropriedadeRepository;

public class AtualizarUseCase {
	
	@Autowired 
	private PropriedadeRepository propriedadeRepository;
	
	public Propriedade atualizarUseCase(long codigoPropriedade, Propriedade propriedadeAtualizada) {
		Optional<Propriedade> propriedadeExistente = propriedadeRepository.findByCodigoPropriedade(codigoPropriedade);
		if (propriedadeExistente.isPresent()) {
			propriedadeExistente.get().setEndereco(propriedadeAtualizada.getEndereco());
			propriedadeExistente.get().setBairro(propriedadeAtualizada.getBairro());
			propriedadeExistente.get().setCep(propriedadeAtualizada.getCep());
			propriedadeExistente.get().setNumero(propriedadeAtualizada.getNumero());
			propriedadeExistente.get().setComplemento(propriedadeAtualizada.getComplemento());
			propriedadeExistente.get().setCidade(propriedadeAtualizada.getCidade());
			propriedadeExistente.get().setUF(propriedadeAtualizada.getUF());
			return propriedadeExistente.get();
		}else {
			return null;
		}
	}

}
