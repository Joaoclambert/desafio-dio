package com.desafio.beer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.beer.model.Beer;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {
	
}
