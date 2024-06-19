package com.app.dtos;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class ApiResponse {
	
	private String mesg;
	private LocalDateTime ts;
	public ApiResponse(String mesg) {
		super();
		this.mesg = mesg;
		this.ts = LocalDateTime.now();
	}
	
	

}
