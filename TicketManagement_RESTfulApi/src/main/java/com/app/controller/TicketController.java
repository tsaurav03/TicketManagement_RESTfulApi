package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Ticket;
import com.app.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {
	
	@Autowired
	private TicketService service;
	
	@GetMapping("/")
	public ResponseEntity<?>findAllTickets(){
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllTickets());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?>findParticularSpecificTicket(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(service.getTicketByID(id));
	}
	
	@PostMapping("/")
	public ResponseEntity<?>createTickets(@RequestBody @Valid Ticket ticket){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createTicket(ticket));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?>updateTicketDetails(@PathVariable Long id,@RequestBody Ticket ticket){
		return ResponseEntity.status(HttpStatus.OK).body(service.updateTicket(id, ticket));
	
	}

}
