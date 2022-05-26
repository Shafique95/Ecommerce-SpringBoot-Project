package com.ecommerce.ecom.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.ecom.app.domain.Size;
import com.ecommerce.ecom.app.repository.ProSizeRepo;
@Controller
public class SizeController {
	@Autowired
	ProSizeRepo psr;
	
	
	
@RequestMapping("/saveSize")
public String saveSize() {
	return "size/Size";
}

// save value to Database
@PostMapping("/saveSize")
public String saveProSize(@ModelAttribute Size size) {
	
	psr.save(size);
	
	return "redirect:/article/add";
}
}
