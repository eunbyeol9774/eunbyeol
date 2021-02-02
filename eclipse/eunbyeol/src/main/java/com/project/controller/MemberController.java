package com.project.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
  
  		service.join(vo);
  	
  		return "redirect:/";
 }
 
 @RequestMapping(value = "/login", method = RequestMethod.GET)
 public void getlogin() throws Exception {
	 logger.info("get login");
	}

 @RequestMapping(value = "/login", method = RequestMethod.POST)
public String postlogin(MemberVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
	logger.info("post login");
		
		HttpSession session = req.getSession();
		MemberVO login = service.login(vo);
		
		if(login == null) {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
		}else {
			session.setAttribute("member", login);
		}
		
		return "redirect:/";
	}
	
 @RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		logger.info("ByeBye logout success");
		return "redirect:/";
	}

 
}

