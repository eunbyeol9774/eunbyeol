package com.project.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.vo.MemberVO;
import com.project.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
 
 @Inject
 MemberService service;
 

 @RequestMapping(value = "/register", method = RequestMethod.GET)
 public void getRegister() throws Exception {
  logger.info("get register");
 }


 @RequestMapping(value = "/register", method = RequestMethod.POST)
 public void postRegister(MemberVO vo) throws Exception {
  logger.info("post resister");
  
  	service.join(vo);
  	
 
 }

}

