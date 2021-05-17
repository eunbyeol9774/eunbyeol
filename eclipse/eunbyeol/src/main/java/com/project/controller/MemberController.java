package com.project.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.vo.MemberVO;
import com.project.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
 
 @Inject
 MemberService service;
 

 @RequestMapping(value = "/join", method = RequestMethod.GET)
 public void getJoin() throws Exception {
	 logger.info("get join");
 }


 @RequestMapping(value = "/join", method = RequestMethod.POST)
 public String postJoin(MemberVO vo) throws Exception {
	 logger.info("post join");
  
  		service.memberjoin(vo);
  	
  		return "redirect:/";
 }
 
 @RequestMapping(value = "/login")
 public String login() {
	 return "member/login";
	}



 @RequestMapping(value = "/logincheck.do")
 public ModelAndView logincheck(@ModelAttribute MemberVO vo, HttpSession session) throws Exception {
   
     boolean result = service.loginCheck(vo, session);
    
     ModelAndView mav = new ModelAndView();

     if (result == true) {         
         mav.setViewName("home"); 
         mav.addObject("message", "success"); 
     }else {
         mav.setViewName("member/login"); 
         mav.addObject("message", "error"); 
     }
     return mav;
 }    


 @RequestMapping(value = "/logout.do")
	public ModelAndView logout(HttpSession session, ModelAndView mav) throws Exception {
	 service.logout(session); 
     mav.setViewName("member/login");
     mav.addObject("message","logout"); 
     return mav; 
	}
 
 

 
}

