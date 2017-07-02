package com.look.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.look.mapper.CategoryMapper;
import com.look.pojo.Category;
import com.look.service.CategoryService;
import com.look.util.Page;

@Service
public class CategoryServiceImpl  implements CategoryService{
    @Autowired
    CategoryMapper categoryMapper;
     
    public List<Category> list(){
        return categoryMapper.list();
    }

	@Override
	public void add(Category category) {
		categoryMapper.add(category);;
	}


    @Override
    public List<Category> list(Page page) {
        // TODO Auto-generated method stub
        return categoryMapper.list(page);
    }
 
    @Override
    public int total() {
        return categoryMapper.total();
    };
 
}