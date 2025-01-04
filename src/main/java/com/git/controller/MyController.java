package com.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/my")
	public String my() {
		return "My...";
	}

	@GetMapping("/check")
	public String Check(){
		return "Checked....";
	}
}
