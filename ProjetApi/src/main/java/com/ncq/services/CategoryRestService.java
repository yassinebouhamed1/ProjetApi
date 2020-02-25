package com.ncq.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ncq.enties.Category;
import com.ncq.metier.CategoryMetier;

@RestController
public class CategoryRestService {
	@Autowired
	private CategoryMetier categoryMetier;
	@RequestMapping(value = "/category",method = RequestMethod.GET)
	public List<Category> findCategory() {
		return categoryMetier.listCategory();
	}
	
	

}
