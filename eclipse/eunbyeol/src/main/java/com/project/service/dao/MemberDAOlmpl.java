package com.project.service.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.project.vo.MemberVO;

@Service
public class MemberDAOlmpl implements MemberDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.project.mappers.memberMapper";
	
	@Override
	public void join(MemberVO vo) throws Exception {
		sql.insert(namespace + ".join", vo);
	}


}
