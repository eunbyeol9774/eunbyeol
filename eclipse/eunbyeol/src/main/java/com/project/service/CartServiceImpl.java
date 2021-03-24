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
    
  
    @Override // �߰�
    public void insert(CartVO vo) {
        cartDao.insert(vo);
    }
 
    @Override // ���
    public List<CartVO> listCart(String user_id) {
        return cartDao.listCart(user_id);
    }
 
    @Override // ����
    public void delete(int cart_id) {
        cartDao.delete(cart_id);
    }
 
    @Override // �ݾ��հ�
    public int sumMoney(String user_id) {
        return CartVO.sumMoney(user_id);
    }

    @Override // ��ǰ ���� ����
    public void updateCart(CartVO vo) {
    	cartDao.updateCart(vo);
 
    }
 
    @Override // ��ٱ��� ����
    public void modifyCart(CartVO vo) {
        cartDao.modifyCart(vo);
    }
    
	@Override
	public void insertcart(CartVO vo) {
		// TODO Auto-generated method stub
		
	}
	@Override // ��ǰ Ȯ��
	public int countCart(int pid, String user_id) {
		// TODO Auto-generated method stub
		return cartDao.sumMoney(user_id);
	}

 
}
