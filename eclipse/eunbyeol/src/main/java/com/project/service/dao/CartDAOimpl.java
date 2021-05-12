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
   	public List<CartVO> listCart(String userid) {
	   return sql.selectList("cartMapper.listCart", userid);
    
   }
   
   @Override
   public void insert(CartVO vo) {
	   sql.insert("cart.insert",vo);
   }
   
   @Override
   public List<CartVO> cartMoney() {
      
       return null;
   }
   
   @Override // 삭제
   public void delete(int cart_id) {
       sql.delete("cart.delete", cart_id);
   }

   @Override // 상품 수량 변경
   public void updateCart(CartVO vo) {
   	sql.selectOne("cart.sumCart", vo);

   }

   @Override // 합계
   public int sumMoney(String userid) {
       return sql.selectOne("cart.sumMoney", userid); 
   }

   @Override // 동일한 상품 레코드 확인
   public int countCart(String userid, int pid) {
       return 0;
   }


   @Override // 수정
   public void modifyCart(CartVO vo) {
       sql.update("cart.modify", vo);
   }


   

}