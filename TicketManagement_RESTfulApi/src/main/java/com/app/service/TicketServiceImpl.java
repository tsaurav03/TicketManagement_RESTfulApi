package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.CustomException;
import com.app.dtos.ApiResponse;
import com.app.dtos.TicketDTO;
import com.app.entities.Ticket;
import com.app.repository.TicketRepository;

@Service
@Transactional
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketRepository repo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<Ticket> getAllTickets() {
		return repo.findAllOpenTickets();
	}

	@Override
	public Ticket getTicketByID(Long id) {
		return repo.findById(id).orElseThrow(()->new CustomException("Ticket with id:"+id+"Not Found"));
	}

	@Override
	public Ticket createTicket(Ticket ticket) {
		return repo.save(ticket);
	}

	@Override
	public ApiResponse updateTicket(Long id, Ticket ticket) {
	       String msg="ticket updation failed";
	       if(repo.existsById(id)) {
	    	   Ticket existingTicket=repo.findById(id).orElse(null);
	    	 if(existingTicket !=null) {
	    		 existingTicket.setStatus(ticket.getStatus());
	    		 existingTicket.setResolutionDetails(ticket.getResolutionDetails());
	    		 existingTicket.setResoloutionUpdationDate(ticket.getResoloutionUpdationDate());
	    		 repo.save(existingTicket);
	    		 msg="Ticket updation successful";
	    	 }
	       }
	       return new ApiResponse(msg);
	}

	

	

}
