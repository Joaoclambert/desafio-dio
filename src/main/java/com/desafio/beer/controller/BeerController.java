package com.desafio.beer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.beer.model.Beer;
import com.desafio.beer.service.BeerService;

@RestController
@RequestMapping("beer")
public class BeerController {

	@Autowired
	private BeerService beerService;
	
	@PostMapping
	public Object criar(@RequestBody Beer beer) {
		var criada = beerService.criar(beer);
		return new ResponseEntity<>(criada, HttpStatus.OK);
	}
	
	@GetMapping
	public Object listar() {
		var cervejas = beerService.listar();
		return new ResponseEntity<>(cervejas, HttpStatus.OK);
	}
	
	@GetMapping("{id}/precoPorLitro")
	public Object precoPorLitro(@PathVariable Long id) {
		var resultado = beerService.precoPorLitro(id);
		return new ResponseEntity<>(resultado, HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public Object deletar(@PathVariable Long id) {
		beerService.deletar(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
