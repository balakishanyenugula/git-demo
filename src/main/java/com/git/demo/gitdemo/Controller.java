package com.git.demo.gitdemo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {
	
	@GetMapping("/getName")
	public String getName() {
		return "Balu";
	}
	@PostMapping
	public void saveData(String name) {
		System.out.println("name..."+name);
		if(name.equals("Balakishan")) {
			System.out.println("true");
		}
	}
	
	@DeleteMapping
	public void deleteData(Integer id) {
		System.out.println("id...."+id);
	}

}
