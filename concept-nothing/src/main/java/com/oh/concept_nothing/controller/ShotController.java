package com.oh.concept_nothing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.oh.concept_nothing.service.ShotService;

@Controller
public class ShotController {
	@Autowired
	ShotService shotservice;

	@GetMapping("/shots")
	public String listAll() {
		
		return shotservice.findAll().toString();
	}
}
