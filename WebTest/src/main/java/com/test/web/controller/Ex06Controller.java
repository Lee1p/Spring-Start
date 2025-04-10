package com.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(value="/ex06.do", method=RequestMethod.GET)

public class Ex06Controller {

	@RequestMapping(value="/ex06.do")
	public String call() {
		
		return "ex06";
	}
	
	@GetMapping(value="/ex06ok.do")
	public String ex06get() {
		
		return "ex06_get";
	}
	
	
	@PostMapping(value="/ex06ok.do")
	public String ex06post() {
		
		return "ex06_post";
	}
	
}
