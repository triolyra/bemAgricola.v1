package br.com.caram_lyra.itau.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caram_lyra.itau.domain.BemAgricola;
import br.com.caram_lyra.itau.domain.Propriedade;
import br.com.caram_lyra.itau.domain.Seguro;
import br.com.caram_lyra.itau.repository.BemAgricolaRepository;
import br.com.caram_lyra.itau.service.BemAgricolaService;
import br.com.caram_lyra.itau.service.PropriedadeService;
import br.com.caram_lyra.itau.service.SeguroService;

@RestController
@RequestMapping("/cadastrar")
@CrossOrigin("*")
public class BemAgricolaController {

	@Autowired
	private BemAgricolaService bemAgricolaService;

	@Autowired
	private SeguroService seguroService;

	@Autowired
	private PropriedadeService propriedadeService;
	
	@Autowired
	private BemAgricolaRepository bemAgricolaRepository;
	
	@PostMapping
	public ResponseEntity<BemAgricola> cadastrarBemAgricola(@RequestBody BemAgricola bemAgricola) {
		return ResponseEntity.status(HttpStatus.CREATED).body(bemAgricolaService.cadastrarBemAgricola(bemAgricola));
	}

	@PostMapping("/seguro")
	public ResponseEntity<Seguro> cadastrarSeguro(@RequestBody Seguro seguro) {
		return ResponseEntity.status(HttpStatus.CREATED).body(seguroService.cadastrarSeguro(seguro));
	}
	
	@PostMapping ("/propriedade")
	public ResponseEntity <Propriedade> incluirPropriedade(@RequestBody Propriedade propriedade){
		return ResponseEntity.status(HttpStatus.CREATED).body(propriedadeService.cadastrarPropriedade(propriedade));
	}
	
	//@GetMapping("/{codigoBem}")
}
