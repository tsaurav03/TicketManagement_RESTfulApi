package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
	@Query("Select t from Ticket t where t.status='OPEN' ")
	List<Ticket>findAllOpenTickets();

}
