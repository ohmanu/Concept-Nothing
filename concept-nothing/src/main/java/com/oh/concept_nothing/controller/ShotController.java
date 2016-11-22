package com.oh.concept_nothing.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.oh.concept_nothing.service.ShotService;
import com.oh.concept_nothing.service.UserService;

@Controller
public class ShotController {
	@Autowired
	ShotService shotservice;
	@Autowired
	UserService userservice;

	@GetMapping("/shots")
	public String listAll(HttpServletRequest request) {
		//request.setAttribute("shots", shotservice.findAll());
		request.setAttribute("shots", userservice.findById(0).getShots());
		
		return "gallery/shots";
	}
}
