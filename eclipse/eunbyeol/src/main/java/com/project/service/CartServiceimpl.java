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
    
 
    @Override // ¸ñ·Ï
    public List<CartVO> listCart(String user_id) {
        return dao.listCart(user_id);
    }
    
  
  
    
    
}
