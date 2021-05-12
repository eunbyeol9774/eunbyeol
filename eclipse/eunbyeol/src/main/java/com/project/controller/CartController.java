package com.project.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;
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
		String userid=(String)session.getAttribute("userid"); 
		
		if(userid!=null) {
    
			List<CartVO> listCart=cartService.listCart(userid);//장바구니 목록
    
  
         map.put("list", listCart); 
         map.put("count", listCart.size()); 
         mav.setViewName("cart/list");
         mav.addObject("map", map);

         return mav;    
         
    	}
    		return mav; 
	}
	
	@RequestMapping("insert.do") //장바구니 추가
	public String insert(@ModelAttribute CartVO vo, HttpSession session) {
		
		String userid=(String) session.getAttribute("userid");
		vo.setUserid(userid);
		int count = cartService.countCart(vo.getPid(),userid);
		if(count == 0) {
			cartService.insert(vo);
		} else {
			cartService.updateCart(vo);
		}
		return "redirect:/cart/list.do";
		
	}
	
	@RequestMapping ("update.do")// 장바구니 수정
	
	public String update(@RequestParam int[] amount, @RequestParam int[] pid, HttpSession session) {
	 String userid=(String) session.getAttribute("userid");
	 for(int i=0; i<pid.length; i++) {
		 CartVO vo = new CartVO();
		 vo.setUserid(userid);
		 vo.setAmount(amount[i]);
		 vo.setPid(pid[i]);
		 cartService.modifyCart(vo);
	 	
	 }
	 
	 return "redirect:/cart/list.do";
	}
	
	@RequestMapping("delete.do") //장바구니 삭제
	
	public String delete(@RequestParam int cart_id) {
		cartService.delete(cart_id);
		return "redirect:/cart/list.do";
		}
 
 }
	
	
	
	
	
	
	
	

	

    

	

 
	
