package io.kiru.springstarterboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
	//@RequestMapping maps t  GET by default.Maps method to call when URL is accessed
	//For other methods you need to specify directly
        @RequestMapping("/hello")
		public String sayHi()
		{
			return "Hi";
		}
}
