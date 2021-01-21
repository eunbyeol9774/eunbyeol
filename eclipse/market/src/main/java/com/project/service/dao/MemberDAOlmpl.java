package com.project.service.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.vo.MemberVO;

@Repository
public class MemberDAOlmpl implements MemberDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.project.mappers.memberMapper";
	
	@Override
	public void signup(MemberVO vo) throws Exception {
		sql.insert(namespace + ".signup", vo);
	}


}


