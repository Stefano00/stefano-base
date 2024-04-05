package com.stefano.stefanobase.service;

import org.springframework.stereotype.Service;

import com.stefano.stefanobase.dto.GenericDTO;
import com.stefano.stefanobase.model.ModelExample;

@Service
public class ServiceExample {

	public GenericDTO modelExampleToGenericDto(ModelExample modelExample) {
		GenericDTO genericDto = new GenericDTO();
		genericDto.setId(modelExample.getId());
		genericDto.setName(modelExample.getName());
		genericDto.setLastName(modelExample.getLastName());
		
		return genericDto;
	}
}
