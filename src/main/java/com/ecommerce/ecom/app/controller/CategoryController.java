package com.ecommerce.ecom.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.ecom.app.domain.Category;
import com.ecommerce.ecom.app.repository.CategoryRepo;

@Controller

public class CategoryController {
	@Autowired
	CategoryRepo cat;
	
@RequestMapping("/save")
 public String catPage() {
		return "category/Save"; 
 }


@PostMapping("/save")
public String saveCategory(@ModelAttribute Category category) {
	cat.save(category);
	
	return "redirect:/article/add";
}
}
