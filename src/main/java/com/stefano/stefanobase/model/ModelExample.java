package com.stefano.stefanobase.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ModelExample {

	@Id
	Long id;
	
	@Column(name = "va_name")
	String name;
	
	@Column(name = "va_last_name")
	String lastName;
}
