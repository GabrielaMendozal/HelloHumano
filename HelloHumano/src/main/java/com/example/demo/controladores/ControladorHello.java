package com.example.demo.controladores;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHello {

	@RequestMapping( value="/" , method=RequestMethod.GET)
	public String index(@RequestParam( value = "saludo" , required = false) String searchQuery) {
		if (searchQuery == null) {
			return "Hello Humano";
		}
		else {
		return "Hello " + searchQuery;
		}
	}
}