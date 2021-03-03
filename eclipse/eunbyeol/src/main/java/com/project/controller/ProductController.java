package com.project.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.service.MemberService;
import com.project.service.ProductService;
import com.project.service.ProductServiceimpl;
import com.project.service.ProjectService;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	 
	 @Inject
	 ProductService productService;
	
	 
	@RequestMapping("/product_list.do")
	public ModelAndView list(ModelAndView mav) throws Exception  {
        mav.setViewName("product/product_list"); 
		
		mav.addObject("list", productService.listProduct()); 
		return mav;
		
	}
		

}
