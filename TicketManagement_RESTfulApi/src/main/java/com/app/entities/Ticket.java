package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tickets")
public class Ticket extends BaseEntity {

	@NotBlank
	@Length(min = 10)
	@Column(name = "phone_no", unique = true)
	private String phoneNumber;

	@Enumerated(EnumType.STRING)
	private Category category;

	@NotBlank
	private String issueDetails;

	@NotBlank
	private String resolutionDetails;

	@Enumerated(EnumType.STRING)
	private Status status;

}
