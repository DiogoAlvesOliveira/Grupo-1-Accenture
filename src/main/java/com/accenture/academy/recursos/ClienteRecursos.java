package com.accenture.academy.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.academy.cliente.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteRecursos {
	
	@GetMapping
	@RequestMapping
	public ResponseEntity<Cliente> findAll(){
		Cliente u = new Cliente(1L, "adson", "32323", "33223");
		return ResponseEntity.ok().body(u);
	}
}
