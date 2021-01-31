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

}

