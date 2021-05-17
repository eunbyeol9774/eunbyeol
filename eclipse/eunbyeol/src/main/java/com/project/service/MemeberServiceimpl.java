package com.project.service;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.project.service.dao.MemberDAO;
import com.project.vo.MemberVO;


@Service
public class MemeberServiceimpl implements MemberService {
	
	@Resource(name = "MemberDAO")
	private MemberDAO dao;
	
	@Override
	public void memberjoin(MemberVO vo) throws Exception {
		dao.memberjoin(vo);
	}
	
	@Override
	public MemberVO memberlogin(MemberVO vo) throws Exception {
		return dao.memberlogin(vo);
	}
	
	@Override
	public boolean loginCheck(MemberVO vo, HttpSession session) throws Exception {
       
       boolean result = dao.loginCheck(vo);
       
        if (result) {
        	
            MemberVO vo2 = memberlogin(vo);     
            session.setAttribute("userid", vo2.getUserid()); 
            session.setAttribute("username",vo2.getUsername());
          
        }
 
        return result;
 
    }
	@Override
	public void logout(HttpSession session) throws Exception {
		session.invalidate();
			}

}
