package com.project.service;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.service.dao.CartDAO;
import com.project.vo.CartVO;

@Service
public class CartServiceimpl implements CartService {
    
   @Resource(name = "cartDAO")
    private CartDAO dao;
    
 
    @Override // 목록
    public List<CartVO> listCart(String userid) {
        return dao.listCart(userid);
    }
    
    @Override // 추가
    public void insert(CartVO vo) {
    	dao.insert(vo);
    }
    
    @Override // 삭제
    public void delete(int cart_id) {
        dao.delete(cart_id);
    }
 
    @Override // 금액합계
    public int sumMoney(String userid) {
        return CartVO.sumMoney(userid);
    }

    @Override // 상품 수량 변경
    public void updateCart(CartVO vo) {
    	dao.updateCart(vo);
 
    }
 
    @Override // 장바구니 수정
    public void modifyCart(CartVO vo) {
        dao.modifyCart(vo);
    }
    
	@Override
	public void insertcart(CartVO vo) {
		
		
	}
	@Override // 상품 확인
	public int countCart(int pid, String userid) {
		
		return dao.sumMoney(userid);
	}

 
}
    
  
  
    
    
}
