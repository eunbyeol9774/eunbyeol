package com.project.service.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.vo.CartVO;

@Repository("cartDAO")

public class CartDAOimpl implements CartDAO{
	
   @Inject
   SqlSession sql;

   @Override
   	public List<CartVO> listCart(String user_id) {
	   return sql.selectList("cartMapper.listCart", user_id);
    
   }
   

}