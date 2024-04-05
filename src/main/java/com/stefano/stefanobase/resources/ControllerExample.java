package com.stefano.stefanobase.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stefano.stefanobase.dto.GenericDTO;
import com.stefano.stefanobase.model.ModelExample;
import com.stefano.stefanobase.service.ServiceExample;

@CrossOrigin
@RestController
public class ControllerExample {
	
	@Autowired
	ServiceExample serviceExample;

	@RequestMapping(value = "controllerDemo", method = RequestMethod.GET)
	public GenericDTO controllerDemo() {
		ModelExample modelExample = new ModelExample();
		modelExample.setId(1l);
		modelExample.setName("Stefano");
		modelExample.setLastName("Marin");
		return serviceExample.modelExampleToGenericDto(modelExample);
	}
	
}
