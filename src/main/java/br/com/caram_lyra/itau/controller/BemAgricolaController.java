package br.com.caram_lyra.itau.controller;

import java.util.List;

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
import br.com.caram_lyra.itau.domain.Garantia;
import br.com.caram_lyra.itau.service.BemAgricolaService;
import br.com.caram_lyra.itau.service.GarantiaService;

@RestController
@RequestMapping("/cadastrar")
@CrossOrigin("*")
public class BemAgricolaController {
	
	@Autowired
	private BemAgricolaService bemAgricolaService;
	
	@Autowired
	private GarantiaService garantiaService;
	
	@PostMapping
	public ResponseEntity <BemAgricola> incluirBemAgricola(@RequestBody BemAgricola bemAgricola){
		return ResponseEntity.status(HttpStatus.CREATED).body(bemAgricolaService.incluirBemAgricola(bemAgricola));
	}
	
	//@PostMapping
	//public ResponseEntity <Garantia> incluirGarantia(@RequestBody Garantia garantia){
		//return ResponseEntity.status(HttpStatus.CREATED).body(garantiaService.incluirGarantia(garantia));
	//}
	
	@PutMapping
	public ResponseEntity<Garantia> incluirGarantia(@RequestBody Garantia garantia){
		return ResponseEntity.status(HttpStatus.OK).body(garantiaService.incluirGarantia(garantia));
	}
	
	@GetMapping("/")
	public ResponseEntity<List<BemAgricola>> findAllBemAgricola{
		
	}
}

