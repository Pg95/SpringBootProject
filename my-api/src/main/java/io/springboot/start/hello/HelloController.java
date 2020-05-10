package io.springboot.start.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController       // create a controller
public class HelloController {

	
	@RequestMapping("/hello")     //request mapping only maps to get method, to map other method hav eto specify in annotation
	public String sayHi(){
		return "Hi";
	}
	
}
