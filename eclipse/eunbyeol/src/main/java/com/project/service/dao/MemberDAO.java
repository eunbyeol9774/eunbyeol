package com.project.service.dao;

import com.project.vo.MemberVO;

public interface MemberDAO {
	
	public void memberjoin(MemberVO vo) throws Exception;
	
	public MemberVO memberlogin(MemberVO vo) throws Exception;

	
}
