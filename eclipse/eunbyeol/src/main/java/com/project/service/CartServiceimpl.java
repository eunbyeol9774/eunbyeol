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
    
 
    @Override // ���
    public List<CartVO> listCart(String userid) {
        return dao.listCart(userid);
    }
    
    @Override // �߰�
    public void insert(CartVO vo) {
    	dao.insert(vo);
    }
    
    @Override // ����
    public void delete(int cart_id) {
        dao.delete(cart_id);
    }
 
    @Override // �ݾ��հ�
    public int sumMoney(String userid) {
        return CartVO.sumMoney(userid);
    }

    @Override // ��ǰ ���� ����
    public void updateCart(CartVO vo) {
    	dao.updateCart(vo);
 
    }
 
    @Override // ��ٱ��� ����
    public void modifyCart(CartVO vo) {
        dao.modifyCart(vo);
    }
    
	@Override
	public void insertcart(CartVO vo) {
		
		
	}
	@Override // ��ǰ Ȯ��
	public int countCart(int pid, String userid) {
		
		return dao.sumMoney(userid);
	}

 
}
    
  
  
    
    
}
