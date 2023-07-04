package com.laptrinhbackend.dao;

import java.util.List;

import com.laptrinhbackend.model.CategoryModel;

public interface ICategoryDAO {
	List<CategoryModel> findAll();
}
