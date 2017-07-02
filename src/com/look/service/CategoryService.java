package com.look.service;

import java.util.List;

import com.look.pojo.Category;
import com.look.util.Page;

public interface CategoryService {
	List<Category> list();

	void add(Category category);

	int total();

	List<Category> list(Page page);
}