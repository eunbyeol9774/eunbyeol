package com.project.service.dao;

import java.util.List;

import com.project.vo.CartVO;

public interface CartDAO {
	

	List<CartVO> listCart(String userid);
	
	void insert(CartVO vo);

	List<CartVO> cartMoney();
	
	void delete(int cart_id);

	void update (int cart_id);
	
	int sumMoney(String userid);
	
	int countCart(String userid, int pid);
	
	void updateCart(CartVO vo);
	
	void modifyCart(CartVO vo);
	
	void insertcart(CartVO vo);
	
	
}