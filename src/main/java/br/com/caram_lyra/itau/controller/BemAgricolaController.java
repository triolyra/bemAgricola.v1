package br.com.caram_lyra.itau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caram_lyra.itau.domain.BemAgricola;
import br.com.caram_lyra.itau.domain.Garantia;
import br.com.caram_lyra.itau.domain.Pessoa;
import br.com.caram_lyra.itau.domain.Seguro;
import br.com.caram_lyra.itau.service.BemAgricolaService;
import br.com.caram_lyra.itau.service.GarantiaService;
import br.com.caram_lyra.itau.service.PessoaService;
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
	private PessoaService pessoaService;

	private GarantiaService garantiaService;

	@PostMapping
	public ResponseEntity<BemAgricola> cadastrarBemAgricola(@RequestBody BemAgricola bemAgricola) {
		return ResponseEntity.status(HttpStatus.CREATED).body(bemAgricolaService.cadastrarBemAgricola(bemAgricola));
	}

	@PostMapping("/garantia")
	public ResponseEntity<Garantia> cadastrarGarantia(@RequestBody Garantia garantia) {
		return ResponseEntity.status(HttpStatus.CREATED).body(garantiaService.cadastrarGarantia(garantia));
	}

	@PostMapping("/seguro")
	public ResponseEntity<Seguro> cadastrarSeguro(@RequestBody Seguro seguro) {
		return ResponseEntity.status(HttpStatus.CREATED).body(seguroService.cadastrarSeguro(seguro));
	}
	
	//@GetMapping("/")
	//public ResponseEntity<List<BemAgricola>> findAllBemAgricola{
	
	@PostMapping("/pessoa")
		 public ResponseEntity<Pessoa> cadastrarPessoa(@RequestBody Pessoa pessoa){
		 return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.cadastrarPessoa(pessoa));
		}
	
	@GetMapping
	public String teste() {
		return "Mensagem para o papai do céu: por favor nos ajude";
	}
}
