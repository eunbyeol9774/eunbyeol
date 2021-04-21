package com.project.service.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.vo.CartVO;

@Repository("CartDAO")
	
public abstract class CartDAOimpl implements CartDAO {
	    
	    
	    @Inject
	    SqlSession sqlSession;
	    
	 
	    @Override // ¸ñ·Ï
	    public List<CartVO> listCart(String user_id) {
	        return sqlSession.selectList("cart.listCart",user_id);
	    }
}