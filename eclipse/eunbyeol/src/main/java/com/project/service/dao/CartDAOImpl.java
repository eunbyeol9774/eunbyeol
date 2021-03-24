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
	 
	    @Override // �߰�
	    public void insert(CartVO vo) {
	        sqlSession.insert("cart.insert", vo); 
	    }
	 
	    @Override // ���
	    public List<CartVO> listCart(String user_id) {
	        return sqlSession.selectList("cart.listCart", user_id);
	    }
	 
	    @Override // ����
	    public void delete(int cart_id) {
	        sqlSession.delete("cart.delete", cart_id);
	    }

	    @Override // ��ǰ ���� ����
	    public void updateCart(CartVO vo) {
	    	sqlSession.selectOne("cart.sumCart", vo);
	 
	    }
	 
	    @Override // �հ�
	    public int sumMoney(String user_id) {
	        return sqlSession.selectOne("cart.sumMoney", user_id); 
	    }
	 
	    @Override // ������ ��ǰ ���ڵ� Ȯ��
	    public int countCart(String user_id, int pid) {
	        return 0;
	    }
	 

	    @Override // ����
	    public void modifyCart(CartVO vo) {
	        sqlSession.update("cart.modify", vo);
	    }

	
	 
	}


