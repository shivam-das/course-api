package io.javabrains.springbootstarter.hellocontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String say() {
		return "Hi";
	}
	@RequestMapping("/tom")
	public String tom() {
		return "Tom";
	}

}
