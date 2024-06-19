package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.dtos.ApiResponse;
import com.app.entities.Ticket;

public interface TicketService {
	List<Ticket> getAllTickets();

	Ticket getTicketByID(Long id);

	Ticket createTicket(Ticket ticket);

	ApiResponse updateTicket(Long id, Ticket ticket);

}
