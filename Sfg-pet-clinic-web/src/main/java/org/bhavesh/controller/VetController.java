package org.bhavesh.controller;

import org.bhavesh.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

	private VetService vetService;
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
	public String getVetIndex(Model model)
	{
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
}
