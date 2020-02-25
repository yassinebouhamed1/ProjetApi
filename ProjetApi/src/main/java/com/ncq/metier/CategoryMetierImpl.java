package com.ncq.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncq.dao.CategoryRepository;
import com.ncq.enties.Category;
@Service
public class CategoryMetierImpl implements CategoryMetier{
	@Autowired
	public CategoryRepository CategoryRepository;
	@Override
	public List<Category> listCategory() {
		return CategoryRepository.findAll();
	}

}
