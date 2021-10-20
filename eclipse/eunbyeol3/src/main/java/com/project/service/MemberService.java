package com.project.service;

import javax.servlet.http.HttpSession;

import com.project.vo.MemberVO;

public interface MemberService {
	
	public void memberjoin(MemberVO vo) throws Exception;
	
	public MemberVO memberlogin(MemberVO vo) throws Exception;
	
	public void logout(HttpSession session) throws Exception;
	
}
