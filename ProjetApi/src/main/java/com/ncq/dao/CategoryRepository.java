package com.ncq.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncq.enties.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
