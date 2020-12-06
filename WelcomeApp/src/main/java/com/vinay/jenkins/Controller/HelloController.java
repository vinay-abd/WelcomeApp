package com.vinay.jenkins.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(("/Hello"))
public class HelloController
{

	@GetMapping("/welcome")
	public String welcomeApp()
	{
		return "welcome to first application";
	}

}
