package com.junetan2ee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String helloPage(Model model) {
		model.addAttribute("greeting", "젠킨스 배포 테스트!!");
		return "hello";
	}
}
