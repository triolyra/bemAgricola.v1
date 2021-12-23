package br.com.caram_lyra.itau.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.caram_lyra.itau.domain.Seguro;
import br.com.caram_lyra.itau.repository.SeguroRepository;
import br.com.caram_lyra.itau.usecase.AtualizarUseCase;
import br.com.caram_lyra.itau.usecase.CadastrarUseCase;

@Service
public class SeguroService {

	@Autowired
	private SeguroRepository seguroRepository;

	@Autowired
	private CadastrarUseCase cadastrarUseCase;
	
	@Autowired
	private AtualizarUseCase atualizarUseCase;
	

	public Seguro incluirSeguro(Seguro seguro) {
		if (cadastrarUseCase.incluirSeguro(seguro)) {
			return null;
		} else {
			seguroRepository.save(seguro);

			return seguro;
		}

	}
public Optional<Seguro> atualizarUseCase(Seguro seguroAtualizado){
	
	if(atualizarUseCase.atualizarUseCase(seguroAtualizado.getCodigoSeguro(),seguroAtualizado)!=null) {
		return Optional.ofNullable(seguroRepository.save(atualizarUseCase.atualizarUseCase(seguroAtualizado.getCodigoSeguro(),seguroAtualizado)));
	}else {
		return Optional.empty();
   }

 }
}