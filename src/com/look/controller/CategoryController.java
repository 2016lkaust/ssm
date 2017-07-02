package com.look.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.look.pojo.Category;
import com.look.service.CategoryService;
import com.look.util.Page;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public ModelAndView listCategory() {
		ModelAndView mav = new ModelAndView();
		List<Category> cs = categoryService.list();

		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}

	@RequestMapping("addCategory")
	public ModelAndView addCategory(Category category) {
		ModelAndView mav = new ModelAndView();
		categoryService.add(category);
		mav.setViewName("success");
		return mav;
	}
	  @RequestMapping("listCategory2")
	    public ModelAndView listCategory(Page page){
	     
	        ModelAndView mav = new ModelAndView();
	        List<Category> cs= categoryService.list(page);
	        int total = categoryService.total();
	        page.caculateLast(total);
	         
	        // 放入转发参数
	        mav.addObject("cs", cs);
	        // 放入jsp路径
	        mav.setViewName("listCategory2");
	        return mav;
	    }
}