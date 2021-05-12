package com.project.service;

import java.util.List;

import com.project.vo.CartVO;

public interface CartService {
	
	
	List<CartVO> listCart(String userid);
	
	void insert (CartVO vo);

	List<CartVO> cartMoney();
	
	void delete(int cart_id);
	
	void update (int cart_id);
	
	int sumMoney(String userid);
	
	void updateCart(CartVO vo);
	
	void modifyCart(CartVO vo);
	
	void insertcart(CartVO vo);
	
	int countCart(int pid, String userid);
	
	
	
}