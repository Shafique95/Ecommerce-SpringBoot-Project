package com.ecommerce.ecom.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.ecom.app.domain.Brand;
import com.ecommerce.ecom.app.repository.BrandRepo;

@Controller
public class BrandController {
	@Autowired
	BrandRepo br;
	@RequestMapping("brand")
public String saveBrand() {
	return "brand/Brand";
}
	// save brand to dataBase
	@PostMapping("/saveBrand")
	public String catBrand(@ModelAttribute Brand brand) {
		br.save(brand);
		
		return "redirect:/article/add";
	}
}
