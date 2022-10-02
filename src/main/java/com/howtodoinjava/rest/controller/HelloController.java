package com.howtodoinjava.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.rest.model.FamilyResponse;
import com.howtodoinjava.rest.model.welcome;

@RestController
@RequestMapping(path = "/sirisha")
public class HelloController {
	
	@GetMapping(path="/", produces = "application/json")
	
	
	
	
	public welcome testWelcome(@RequestParam String name){
		
		
		
		
		welcome wc = new welcome();
		
		
		//wc.setWelcomemessage("how are you "+name);
		wc.welcomemessage = "how are you"+ name;
		
		
		return wc;
		 
	}
	
	@GetMapping(path="/givefamily", produces = "application/json")
	public FamilyResponse giveFamily(){
		
		FamilyResponse fr = new FamilyResponse();
		List la = new ArrayList();
		
		la.add("Rajesh");
		la.add("Sirisha");
		la.add("Viswa");
		la.add("Saanvi");
		
		fr.setLi(la);
		
		return fr;
		
	}

}
