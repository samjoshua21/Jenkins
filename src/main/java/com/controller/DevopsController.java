package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	@GetMapping(value="/getname")
	public String a() {
		return "dani";
	}

}
