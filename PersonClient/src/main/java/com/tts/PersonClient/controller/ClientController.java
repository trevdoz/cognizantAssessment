package com.tts.PersonClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.tts.PersonMicro.Person;

@RestController
public class ClientController{
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{personId}")
	public Person getPersonById(@PathVariable Long id) {
		Person person = restTemplate.getForObject("localhost8080:/person?id=" + personId, PersonMicro.class);
		
		
	}
	
	
}
