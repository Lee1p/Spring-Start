package com.test.web.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.web.model.AddressDTO;
import com.test.web.model.SpringDAO;

@Controller
public class Ex07Controller {

	@GetMapping("/ex07.do")
	public String ex07() {

		return "ex07";
	}

//	@PostMapping("/ex07ok.do")
//	public String ex07ok(HttpServletRequest req) {
//		
//		try {
//			req.setCharacterEncoding("UTF-8");
//			
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		
//		String data = req.getParameter("data");
//		
//		req.setAttribute("data", data);
//		
//		return "ex07ok";
//	}

	// 기존 방식
	// - req.getParameter("key")

	// 스프링
	// - @RequestParam("key")
	// - 파라미터 자동 수집
	/*
	 * @PostMapping("/ex07ok.do") public String ex07ok(@RequestParam("data") String
	 * data, Model model) {
	 * 
	 * 
	 * // @RequestParam("data") String data 이거랑 아래랑 완전히 똑같은 기능을한다. //String data =
	 * req.getParameter("data");
	 * 
	 * //System.out.println(data);
	 * 
	 * model.addAttribute("data", data);
	 * 
	 * return "ex07ok"; }
	 */

//	@PostMapping("/ex07ok.do")
//	public String ex07ok(@RequestParam("data") String data, Model model) {
//		
//		//String req.getParameter("key")
//		
//		int num = Integer.parseInt(data);
//		
//		model.addAttribute("data", num * 2);
//		
//		return "ex07ok";
//	}

//	@PostMapping("/ex07ok.do")
//	public String ex07ok(@RequestParam("data") int data, Model model) {
//		
//		model.addAttribute("data", data * 3);
//		
//		return "ex07ok";
//	}

//	@PostMapping("/ex07ok.do")
//	public String ex07ok(@RequestParam(name= "data", defaultValue="100")Integer data, Model model ) {
//		
//		// 스프링에서는 그냥 int 형 사용하는거보다 참조형 Integer 사용하는게 안전함 . Null도됨.
//		model.addAttribute("data", data);
//		
//		return "ex07ok";
//	}

//	@PostMapping("/ex07ok.do")
//	public String ex07ok(@RequestParam("name") String data, Model model ) {
//		
//		//req.getParameter("")
//		
//		//@RequestParam 생략 가능
//		//- 생략 가능 조건
//		//
//		
//		model.addAttribute("data", data);
//		
//		return "ex07ok";
//	}

//	@PostMapping("/ex07ok.do")
//	public String ex07ok(String name, Model model ) {
//		
//		//req.getParameter("")
//		
//		//@RequestParam 생략 가능
//		//JSP 파일에서 input name 에 변수명이랑 매개변명이랑 맟춰야함 
//		//예를 들어 , 지금 jsp input 타입 name 이 name 이라서 String name 으로 설정해놓
//		
//		model.addAttribute("data", name);
//		
//		return "ex07ok";
//	}

//	@PostMapping("/ex07ok.do")
//	public String ex07ok(Model model, 
//			@RequestParam("name") String name, 
//			@RequestParam("age") Integer age,
//			@RequestParam("address") String address) {
//		
//		//DB insert		
//		AddressDTO dto = new AddressDTO();
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setAddress(address);
//		
//		SpringDAO dao = new SpringDAO();
//		dao.add(dto);
//	
//		
//		return "ex07ok";
//	}

//	@PostMapping("/ex07ok.do")
//	public String ex07ok(
//			Model model, 
//			String name, 
//			Integer age,
//			String address) {
//		
//		//DB insert		
//		AddressDTO dto = new AddressDTO();
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setAddress(address);
//		
//		SpringDAO dao = new SpringDAO();
//		dao.add(dto);
//	
//		
//		return "ex07ok";
//	}

//	@PostMapping("/ex07ok.do")
//	public String ex07ok(
//			Model model,
//			AddressDTO dto) {
//		
//		//AddressDTO dto 제공받기 위한 조건
//		//- 태그의 name과 DTO의 setter명이 동일
//		
//		//DB insert		
//		SpringDAO dao = new SpringDAO();
//		dao.add(dto);
//	
//		
//		return "ex07ok";
//	}

//	@PostMapping("/ex07ok.do")
//	public String ex07ok(
//			Model model,
//			@RequestParam("cb") String[] cb) {
//			//req.getParameterValues("cb")
//		
//		model.addAttribute("cb", Arrays.toString(cb));
//		
//		return "ex07ok";
//	}
	
//	@PostMapping("/ex07ok.do")
//	public String ex07ok(
//			Model model,
//			AddressDTO dto,
//			String seq) {
//				
//		SpringDAO dao = new SpringDAO();
//		dao.add(dto);
//	
//		
//		return "ex07ok";
//	}
	
	
	@PostMapping("/ex07ok.do")
	public String ex07ok(
			Model model,
			@ModelAttribute("data") String data) {
				
		//@ModelAttribute = getParameter + addAttribute
		
		//model.addAttribute("data", data);
		
		return "ex07ok";
	}
	

}
