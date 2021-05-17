package com.project.service.dao;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.project.vo.MemberVO;


@Repository("MemberDAO")
public class MemberDAOimpl implements MemberDAO {
	
	@Inject
	private SqlSession sql;
	
	@Override
	public void memberjoin(MemberVO vo) throws Exception {
		sql.insert("memberMapper.memberjoin", vo);
		
	}
	@Override
	public MemberVO memberlogin(MemberVO vo) throws Exception {
		return sql.selectOne("memberMapper.memberlogin", vo);
	}

	
	 @Override
	    public boolean loginCheck(MemberVO vo) { 
		 String name = sql.selectOne("member.loginCheck", vo);
		 return (name == null) ? false : true;
	 }
	 
	 @Override
	 public void logout(HttpSession session) {
		 
	 }
	 
}