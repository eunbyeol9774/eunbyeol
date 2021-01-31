package com.project.service;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.project.service.dao.MemberDAO;
import com.project.vo.MemberVO;


@Service
public class MemeberServiceimpl implements MemberService {
	
	@Resource(name = "memberDAO")
	private MemberDAO dao;
	
	@Override
	public void join(MemberVO vo) throws Exception {
		dao.join(vo);
	}

}
