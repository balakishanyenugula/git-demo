package com.git.demo.gitdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {
	
	@GetMapping("/get")
	public String getName() {
		return "Balakishan";
	}
	@PostMapping
	public void saveData(String name) {
		System.out.println("name..."+name);
		if(name.equals("Balakishan")) {
			System.out.println("true");
		}
	}

}
