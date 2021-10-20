package com.project.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
 
 @RequestMapping(value = "/login", method = RequestMethod.POST)

 public String login(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
	 logger.info("post login");
     HttpSession session = req.getSession();
     MemberVO login = service.memberlogin(vo);
     if(login == null) {
        session.setAttribute("member", null);
        rttr.addFlashAttribute("msg", false);
     }else {
    	
    	session.setAttribute("member",login);
        rttr.addFlashAttribute("msg", true);
		
     }
     
     return "redirect:/member/login";

 }
 
 @RequestMapping(value = "/login", method = RequestMethod.GET)
 public String login() {
	 return "member/login";
	}


 @RequestMapping(value = "/logout", method = RequestMethod.GET)
public String logout(HttpSession session) throws Exception{
	 
	
		 
		 session.removeAttribute("login");
		 
		 session.invalidate();
	 
	 
	
     return "redirect:/";

 }

 

 
}
