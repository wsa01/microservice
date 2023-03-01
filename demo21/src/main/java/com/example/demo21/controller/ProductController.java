package com.example.demo21.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping
	public ResponseEntity<?> hola(){
		return new ResponseEntity("hola",HttpStatus.OK);
	}
	
}
