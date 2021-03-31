package com.project.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.service.CartService;
import com.project.vo.CartVO;
import com.sun.javafx.collections.MappingChange.Map;


@Controller
@RequestMapping("/cart/*")
public class CartController {
	
	@Inject
	CartService cartService;
	
 
	@RequestMapping("list.do") //장바구니 목록
 	public ModelAndView listcart(HttpSession session, ModelAndView mav) {
	HashMap<String, Object> map = new HashMap<String,Object>();
    String user_id=(String)session.getAttribute("user_id");   
    List<CartVO> listcart=cartService.listCart(user_id);//장바구니 목록
    
  
         map.put("list", listcart); 
         map.put("count", listcart.size()); 
         mav.setViewName("cart/list");
         mav.addObject("map", map);

         return mav;    
         
     }
}