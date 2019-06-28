package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.web.app.models.service.MiServicio;

@Controller
public class IndexController {
	
	@Autowired
	private MiServicio servicio = new MiServicio();
	
	@GetMapping({"/","","index"})
	 public String index(Model model) 
	 {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	 }
}
