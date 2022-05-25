package com.desafio.beer.service;

import java.util.List;

import com.desafio.beer.model.Beer;

public interface BeerService {
	Beer criar(Beer beer);
	List<Beer> listar();
	Double precoPorLitro(Long id);
	void deletar(Long id);
}
