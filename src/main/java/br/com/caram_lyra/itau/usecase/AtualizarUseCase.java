package br.com.caram_lyra.itau.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.caram_lyra.itau.domain.BemAgricola;
import br.com.caram_lyra.itau.domain.Propriedade;
import br.com.caram_lyra.itau.domain.Seguro;
import br.com.caram_lyra.itau.repository.BemAgricolaRepository;
import br.com.caram_lyra.itau.repository.PropriedadeRepository;
import br.com.caram_lyra.itau.repository.SeguroRepository;
@Component
public class AtualizarUseCase {
	
	@Autowired 
	private PropriedadeRepository propriedadeRepository;
	
	@Autowired 
	private BemAgricolaRepository bemAgricolaRepository;
	
	@Autowired
	private SeguroRepository seguroRepository;
	
	
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
			
	public BemAgricola atualizarUseCase(long codigoBem, BemAgricola bemAgricolaAtualizado) {
		Optional<BemAgricola> bemAgricolaExistente = bemAgricolaRepository.findByCodigoBem(codigoBem);
		if (bemAgricolaExistente.isPresent()) {		
			bemAgricolaExistente.get().setTipoBemAgricola(bemAgricolaAtualizado.getTipoBemAgricola());
			bemAgricolaExistente.get().setFuncionalColaborador(bemAgricolaAtualizado.getFuncionalColaborador());
			bemAgricolaExistente.get().setSafra(bemAgricolaAtualizado.getSafra());
			bemAgricolaExistente.get().setQuantidade(bemAgricolaAtualizado.getQuantidade());
			bemAgricolaExistente.get().setColheitaRealizada(bemAgricolaAtualizado.isColheitaRealizada());
			bemAgricolaExistente.get().setUnidadeMedida(bemAgricolaAtualizado.getUnidadeMedida());
			bemAgricolaExistente.get().setTipoMoeda(bemAgricolaAtualizado.getTipoMoeda());
			bemAgricolaExistente.get().setDataInclusao(bemAgricolaAtualizado.getDataInclusao());
			bemAgricolaExistente.get().setDataAvaliacao(bemAgricolaAtualizado.getDataAvaliacao());
			bemAgricolaExistente.get().setSeguro(bemAgricolaAtualizado.getSeguro());
			bemAgricolaExistente.get().setPropriedade(bemAgricolaAtualizado.getPropriedade());
			return bemAgricolaExistente.get();
		}else {
			return null;
		}
	}
			
	public Seguro atualizarUseCase(long codigoSeguro, Seguro seguroAtualizado) {
		Optional<Seguro> seguroExistente = seguroRepository.findByCodigoSeguro(codigoSeguro);
		if (seguroExistente.isPresent()) {		
			seguroExistente.get().setNumApolice(seguroAtualizado.getNumApolice());
			seguroExistente.get().setCnpjSeguradora(seguroAtualizado.getCnpjSeguradora());
			seguroExistente.get().setDataInicio(seguroAtualizado.getDataInicio());
			seguroExistente.get().setDataFimAvaliacao(seguroAtualizado.getDataFimAvaliacao());
			return seguroExistente.get();
		}else {
			return null;
		}
	}

}
