package br.com.caram_lyra.itau.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caram_lyra.itau.domain.Propriedade;
import br.com.caram_lyra.itau.repository.PropriedadeRepository;
import br.com.caram_lyra.itau.usecase.CadastrarUseCase;

@Service
public class PropriedadesService {

	@Autowired
	private PropriedadeRepository propriedadeRepository;

	@Autowired
	private CadastrarUseCase cadastrarUseCase;

	public Propriedade incluirPropriedade(Propriedade propriedade) {
		if (cadastrarUseCase.incluirPropriedade(propriedade)) {
			return null;
		} else {
			propriedadeRepository.save(propriedade);

			return propriedade;
		}
	}
		
		public Optional<Propriedade> atualizarUseCase(long idPropriedade, Propriedade propriedadeAtualizada){
			Optional<Propriedade> propriedadeExistente = propriedadeRepository.findById(idPropriedade);
			
			if(propriedadeExistente.isPresent()) {
				propriedadeExistente.get().setEndereco(propriedadeAtualizada.getEndereco());
				propriedadeExistente.get().setBairro(propriedadeAtualizada.getBairro());
				propriedadeExistente.get().setCep(propriedadeAtualizada.getCep());
				propriedadeExistente.get().setNumero(propriedadeAtualizada.getNumero());
				propriedadeExistente.get().setComplemento(propriedadeAtualizada.getComplemento());
				propriedadeExistente.get().setCidade(propriedadeAtualizada.getCidade());
				propriedadeExistente.get().setUF(propriedadeAtualizada.getUF());
				return Optional.ofNullable(propriedadeRepository.save(propriedadeExistente.get()));
			}else {
				return Optional.empty();
	}
	
  }
	}
	
	


