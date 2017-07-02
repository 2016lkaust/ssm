package com.look.mapper;

import java.util.List;

import com.look.pojo.Category;
import com.look.util.Page;
  
public interface CategoryMapper {
  
	 public int add(Category category);  
     
	    public void delete(int id);  
	        
	    public Category get(int id);  
	      
	    public int update(Category category);   
	        
	    public List<Category> list();
	     
	    public List<Category> list(Page page);
	     
	    public int total();    
     
}