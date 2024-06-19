package com.app.dtos;

import com.app.entities.Category;
import com.app.entities.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TicketDTO {
	
	private String phoneNumber;
	private Category category;
	private String issueDetails;
	private String resolutionDetails;
	private Status status;
}
