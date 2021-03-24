package com.project.service;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.service.dao.CartDAO;
import com.project.vo.CartVO;

@Service("cartService")
public abstract class CartServiceImpl implements CartService {
    
    @Resource (name="CartDAO")
    private CartDAO cartDao;
    
  
    @Override // 추가
    public void insert(CartVO vo) {
        cartDao.insert(vo);
    }
 
    @Override // 목록
    public List<CartVO> listCart(String user_id) {
        return cartDao.listCart(user_id);
    }
 
    @Override // 삭제
    public void delete(int cart_id) {
        cartDao.delete(cart_id);
    }
 
    @Override // 금액합계
    public int sumMoney(String user_id) {
        return CartVO.sumMoney(user_id);
    }

    @Override // 상품 수량 변경
    public void updateCart(CartVO vo) {
    	cartDao.updateCart(vo);
 
    }
 
    @Override // 장바구니 수정
    public void modifyCart(CartVO vo) {
        cartDao.modifyCart(vo);
    }
    
	@Override
	public void insertcart(CartVO vo) {
		// TODO Auto-generated method stub
		
	}
	@Override // 상품 확인
	public int countCart(int pid, String user_id) {
		// TODO Auto-generated method stub
		return cartDao.sumMoney(user_id);
	}

 
}
