package com.project.service.dao;

import javax.servlet.http.HttpSession;

import com.project.vo.MemberVO;

public interface MemberDAO {
	
	public void memberjoin(MemberVO vo) throws Exception;
	
	public MemberVO memberlogin(MemberVO vo) throws Exception;

	public boolean loginCheck(MemberVO vo);
	 
	public void logout(HttpSession session);
}
