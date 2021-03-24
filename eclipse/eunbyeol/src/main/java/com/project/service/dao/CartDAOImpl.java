package com.project.service.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.vo.CartVO;

@Repository("CartDAO")
	public abstract class CartDAOImpl implements CartDAO {
	    
	    
	    @Inject
	    SqlSession sqlSession;
	    
	    @Override
	    public List<CartVO> cartMoney() {
	       
	        return null;
	    }
	 
	    @Override // 추가
	    public void insert(CartVO vo) {
	        sqlSession.insert("cart.insert", vo); 
	    }
	 
	    @Override // 목록
	    public List<CartVO> listCart(String user_id) {
	        return sqlSession.selectList("cart.listCart", user_id);
	    }
	 
	    @Override // 삭제
	    public void delete(int cart_id) {
	        sqlSession.delete("cart.delete", cart_id);
	    }

	    @Override // 상품 수량 변경
	    public void updateCart(CartVO vo) {
	    	sqlSession.selectOne("cart.sumCart", vo);
	 
	    }
	 
	    @Override // 합계
	    public int sumMoney(String user_id) {
	        return sqlSession.selectOne("cart.sumMoney", user_id); 
	    }
	 
	    @Override // 동일한 상품 레코드 확인
	    public int countCart(String user_id, int pid) {
	        return 0;
	    }
	 

	    @Override // 수정
	    public void modifyCart(CartVO vo) {
	        sqlSession.update("cart.modify", vo);
	    }

	
	 
	}


