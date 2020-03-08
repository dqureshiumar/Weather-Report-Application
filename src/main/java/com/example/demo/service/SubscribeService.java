package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import com.example.demo.model.Subscribe;

import com.example.demo.repository.SubscribeRepository;

@Service
@Transactional
public class SubscribeService {

private final SubscribeRepository subsRepository;
	
	public SubscribeService(SubscribeRepository subsRepository) {
		this.subsRepository = subsRepository;
	}
public void saveMyEmail(Subscribe subs) {
		
		subsRepository.save(subs);
	}
}
