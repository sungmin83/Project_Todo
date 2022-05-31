package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("todo")
public class TodoController {
	@GetMapping
	public String testTodo() {
		return "Hello Todo World!";
	}
}