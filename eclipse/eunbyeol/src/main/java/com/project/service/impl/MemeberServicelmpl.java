package com.project.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.project.service.MemberService;
import com.project.service.dao.MemberDAO;
import com.project.vo.MemberVO;


@Service
public class MemeberServicelmpl implements MemberService {
	
	@Inject
	private MemberDAO dao;
	
	@Override
	public void join(MemberVO vo) throws Exception {
		dao.join(vo);
	}

}