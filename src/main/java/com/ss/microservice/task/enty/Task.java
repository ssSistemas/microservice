package com.ss.microservice.task.enty;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Data
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	@NotNull(message = "{NotNull.task}")
	@Size(min=5,max=255)
	private String name;
	
	@Column
	@NotNull(message = "{NotNull.task}")
	@Size(min=5,max=255)
	private String description;

	
}
