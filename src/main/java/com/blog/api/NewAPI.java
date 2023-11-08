package com.blog.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewAPI {

	@GetMapping
	public String testAPI() {
		return "success";
	}
}
