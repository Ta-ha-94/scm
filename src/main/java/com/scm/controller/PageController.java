package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/home")
	public String home(Model model) {
		System.out.println("Home Page Handler...");
		model.addAttribute("name", "Taha");
		model.addAttribute("Youtube Channel", "Codingsy");
		return "home";
	}
}
