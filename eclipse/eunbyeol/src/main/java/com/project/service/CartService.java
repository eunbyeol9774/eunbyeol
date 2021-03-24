package com.project.service;

import java.util.List;

import com.project.vo.CartVO;

public interface CartService {
	
	List<CartVO> cartMoney();
	
	void insert(CartVO vo);
	
	List<CartVO> listCart(String user_id);
	
	void delete(int cart_id);
	
	void update (int cart_id);
	
	int sumMoney(String user_id);
	
	void updateCart(CartVO vo);
	
	void modifyCart(CartVO vo);
	
	void insertcart(CartVO vo);
	
	int countCart(int pid, String user_id);
	
	
	
	
	
	
	

}