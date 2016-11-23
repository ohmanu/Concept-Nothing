package com.oh.concept_nothing.controller;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.oh.concept_nothing.domain.Shot;
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
		Iterable<Shot> shots = shotservice.findAll();
		
		if(shots != null)
			request.setAttribute("shots", shotservice.findAll());
		else
			request.setAttribute("shots", Collections.emptyList());
		
		return "gallery/shots";
	}
}
