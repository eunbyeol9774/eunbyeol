package com.project.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.project.service.MemberService;
import com.project.vo.MemberVO;

@Controller
@RequestMapping(value = "/member/*")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService service;

	
	  
	// 회원 가입 get
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public void getSignup() throws Exception {
		logger.info("get signup");
	}

	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String postSignup(MemberVO vo) throws Exception {
	 logger.info("post signup");
	  

	 service.signup(vo);

	 return "redirect:/";
	}
	

}
