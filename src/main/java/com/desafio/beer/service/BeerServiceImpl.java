package com.desafio.beer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.beer.model.Beer;
import com.desafio.beer.repository.BeerRepository;

@Service
public class BeerServiceImpl implements BeerService {
	
	@Autowired
	private BeerRepository beerRepository;

	@Override
	public Beer criar(Beer beer) {
		Beer criada = beerRepository.save(beer);
		
		return criada;
	}

	@Override
	public List<Beer> listar() {
		return beerRepository.findAll();
	}

	@Override
	public Double precoPorLitro(Long id) {
		Beer cerveja = beerRepository.getById(id);
		
		double resultado = cerveja.getValor() / cerveja.getLitrosEmbalagem();
		
		return resultado;
	}

	@Override
	public void deletar(Long id) {
		beerRepository.deleteById(id);
	}

}
