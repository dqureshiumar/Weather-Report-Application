package com.example.demo.service;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Place;
import com.example.demo.repository.PlaceRepository;


@Service
@Transactional
public class PlaceService {
	
private final PlaceRepository placeRepository;
	
	public PlaceService(PlaceRepository placeRepository) {
		this.placeRepository = placeRepository;
	}
	
	
	
	public void saveMyCity(Place place) {
		
		placeRepository.save(place);
	}
	
	public Place findByPlace(String place) {
		return placeRepository.findByCity(place);
	}
	
	public List<Place> showAllPlaces(){
		List<Place> places = new ArrayList<Place>();
		for(Place place:placeRepository.findAll()) {
			places.add(place);
		}
		return places;
	}
	
	public Place editPlace(String city) {
		return placeRepository.findByCity(city);
		
	}



	public void saveImage(MultipartFile demoimage) throws Exception {
		// TODO Auto-generated method stub
		String folder="/photos/";
		byte[] bytes = demoimage.getBytes();
		
		Path path = Paths.get(folder + demoimage.getOriginalFilename());
		
		Files.write(path,bytes);
	}

}
