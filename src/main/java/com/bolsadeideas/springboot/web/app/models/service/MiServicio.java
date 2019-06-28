package com.bolsadeideas.springboot.web.app.models.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("miServicioSimple")
public class MiServicio implements IServicio {
	
	@Override
	public String operacion() 
	{
		return "ejecutando algún proceso importante...";
	}

}
