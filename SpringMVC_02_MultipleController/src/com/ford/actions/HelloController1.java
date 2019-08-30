package com.ford.actions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {
	@RequestMapping("/hello1")
	public String display() {
		//System.out.println(HelloController1.class);
		System.out.println("Hello from HelloController1............!");
		return "viewpage1";
	}
}
