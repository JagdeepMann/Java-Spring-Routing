package com.suraj.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingConroller {
	@RequestMapping("")
	public String strings() {
		return "Hello Coding Dojo!";	
	}
	@RequestMapping("/python")
	public String strings2() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/java")
	public String strings3() {
		return "Java/Spring is better!";
	}
}
