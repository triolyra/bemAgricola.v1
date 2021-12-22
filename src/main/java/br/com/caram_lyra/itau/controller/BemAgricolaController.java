package br.com.caram_lyra.itau.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caram_lyra.itau.domain.BemAgricola;
//import br.com.caram_lyra.itau.domain.Garantia;
import br.com.caram_lyra.itau.domain.Propriedade;
import br.com.caram_lyra.itau.domain.Seguro;
import br.com.caram_lyra.itau.service.BemAgricolaService;
//import br.com.caram_lyra.itau.service.GarantiaService;
import br.com.caram_lyra.itau.service.PropriedadesService;
import br.com.caram_lyra.itau.service.SeguroService;

@RestController
@RequestMapping("/cadastrar")
@CrossOrigin("*")
public class BemAgricolaController {
	
	@Autowired
	private BemAgricolaService bemAgricolaService;
	
	//@Autowired
	//private GarantiaService garantiaService;
	
	@Autowired
	private PropriedadesService propriedadeService;
	
	@Autowired
	private SeguroService seguroService;
	
	@PostMapping
	public ResponseEntity <BemAgricola> incluirBemAgricola(@RequestBody BemAgricola bemAgricola){
		return ResponseEntity.status(HttpStatus.CREATED).body(bemAgricolaService.incluirBemAgricola(bemAgricola));
	}
	
	//@PostMapping
	//public ResponseEntity <Garantia> incluirGarantia(@RequestBody Garantia garantia){
		//return ResponseEntity.status(HttpStatus.CREATED).body(garantiaService.incluirGarantia(garantia));
	//}
	
	@GetMapping
	public String teste() {
		return "olaaa";
	}

	@PostMapping ("/cadastrarPropriedade")
	public ResponseEntity <Propriedade> IncluirPropriedade(@RequestBody Propriedade propriedade){
		return ResponseEntity.status(HttpStatus.CREATED).body(propriedadeService.incluirPropriedade(propriedade));
	}
	
	@PutMapping ("/atualizarPropriedade/{codigoPropriedade}")
	public ResponseEntity <Propriedade> atualizarPropriedade (@RequestBody Propriedade atualizacaoPropriedade){
		return propriedadeService.atualizarUseCase(atualizacaoPropriedade)
				.map(propriedadeAtualizada -> ResponseEntity.status(201).body(propriedadeAtualizada))
				.orElse(ResponseEntity.status(400).build());
	}
	
	@PutMapping ("/atualizarBemAgricola/{codigoBem}")
	public ResponseEntity <BemAgricola> atualizarBemAgricola (@RequestBody BemAgricola atualizacaoBemAgricola){
		return bemAgricolaService.atualizarUseCase(atualizacaoBemAgricola)
				.map(bemAgricolaAtualizado -> ResponseEntity.status(201).body(bemAgricolaAtualizado))
				.orElse(ResponseEntity.status(400).build());
	}
	
	@PutMapping ("/atualizarSeguro/{codigoSeguro}")
	public ResponseEntity <Seguro> atualizarSeguro (@RequestBody Seguro atualizacaoSeguro){
		return seguroService.atualizarUseCase(atualizacaoSeguro)
				.map(seguroAtualizado -> ResponseEntity.status(201).body(seguroAtualizado))
				.orElse(ResponseEntity.status(400).build());
    }
}

    



