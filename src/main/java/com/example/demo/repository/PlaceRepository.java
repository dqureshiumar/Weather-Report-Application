package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Place;

public interface PlaceRepository extends CrudRepository<Place, Integer> {

	public Place findByCity(String city);
	
}
