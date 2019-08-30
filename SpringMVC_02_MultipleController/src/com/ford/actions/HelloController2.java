package com.ford.actions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {
	
	@RequestMapping("/hello2")
	public String display() {
		//System.out.println(HelloController1.class);
		System.out.println("Hello from HelloController2............!");
		return "viewpage2";
	}
}
