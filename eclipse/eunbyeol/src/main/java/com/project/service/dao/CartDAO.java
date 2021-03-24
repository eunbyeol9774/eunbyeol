package com.project.service.dao;

import java.util.List;

import com.project.vo.CartVO;

public interface CartDAO {
	
	List<CartVO> cartMoney();
	
	void insert(CartVO vo);
	
	List<CartVO> listCart(String user_id);
	
	void delete(int cart_id);

	void update (int cart_id);
	
	int sumMoney(String user_id);
	
	int countCart(String user_id, int pid);
	
	void updateCart(CartVO vo);
	
	void modifyCart(CartVO vo);
	
	void insertcart(CartVO vo);
	
	

}
