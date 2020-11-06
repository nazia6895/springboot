package com.springbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcController {

	@GetMapping("/greeting")
	public String greeting(Model m,
			@RequestParam(value = "name", required = false, defaultValue = "Nazia") String name) {
		m.addAttribute("name", name);
		return "greeting";
	}

}
