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
import br.com.caram_lyra.itau.domain.Pessoa;
import br.com.caram_lyra.itau.service.BemAgricolaService;
import br.com.caram_lyra.itau.service.PessoaService;

@RestController
@RequestMapping("/cadastrar")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BemAgricolaController {

	@Autowired
	private BemAgricolaService bemAgricolaService;

	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping
	public ResponseEntity<BemAgricola> cadastrarBem(@RequestBody BemAgricola bemAgricola) {
		return ResponseEntity.status(HttpStatus.CREATED).body(bemAgricolaService.cadastrarBemAgricola(bemAgricola));
	}

	@PostMapping("/cadastrarPessoa")
	 public ResponseEntity<Pessoa> cadastrarPessoa(@RequestBody Pessoa pessoa){
	 return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.cadastrarPessoa(pessoa));
	}

	@GetMapping
	public String teste() {
		return "olaaa";
	}
}
