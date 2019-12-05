package kr.or.ksmart.mybatisprac1120.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("layout", "thymeleaf layout");
		return "index";
		
	}
}
