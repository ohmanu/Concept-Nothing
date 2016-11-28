package com.oh.concept_nothing.controller;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.oh.concept_nothing.domain.Shot;
import com.oh.concept_nothing.service.ShotService;
import com.oh.concept_nothing.service.UserService;
import com.oh.concept_nothing.storage.StorageService;

@Controller
public class ShotController {
	
	@Autowired
	ShotService shotService;
	
	@Autowired
	UserService userService;
	
	private final StorageService storageService;
	
	@Autowired
    public ShotController(StorageService storageService) {
        this.storageService = storageService;
    }
	
	@GetMapping("/shots")
	public String listAll(HttpServletRequest request) {
		Iterable<Shot> shots = shotService.findAll();
		
		if(shots != null)
			request.setAttribute("shots", shotService.findAll());
		else
			request.setAttribute("shots", Collections.emptyList());
		
		return "gallery/shots";
	}
	
	@GetMapping("/upload-shot")
	public String form(HttpServletRequest request) {
		request.setAttribute("shot", new Shot());
		
		return "gallery/upload-shot";
	}
	
	@PostMapping("/upload")
	public String up(@RequestParam("file") MultipartFile file) {		
		storageService.store(file);
		
		return "redirect:upload-shot";
	}
}
