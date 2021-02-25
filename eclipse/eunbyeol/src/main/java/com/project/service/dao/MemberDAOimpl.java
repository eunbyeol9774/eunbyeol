package com.project.service.dao;

import javax.inject.Inject;

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


}