package com.project.service;

import java.util.List;

import com.project.vo.CartVO;

public interface CartService {
	
	
	List<CartVO> listCart(String userid);
	
	void insertCart (CartVO vo);
	
	void delete(int cart_id);	
	
	int sumMoney(String userid);
	
	void updateCart(CartVO vo);
	
	void modifyCart(CartVO vo);
	
	
	int countCart(int pid, String userid);
	
	
	
}