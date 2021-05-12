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
   
   @Override // ����
   public void delete(int cart_id) {
       sql.delete("cart.delete", cart_id);
   }

   @Override // ��ǰ ���� ����
   public void updateCart(CartVO vo) {
   	sql.selectOne("cart.sumCart", vo);

   }

   @Override // �հ�
   public int sumMoney(String userid) {
       return sql.selectOne("cart.sumMoney", userid); 
   }

   @Override // ������ ��ǰ ���ڵ� Ȯ��
   public int countCart(String userid, int pid) {
       return 0;
   }


   @Override // ����
   public void modifyCart(CartVO vo) {
       sql.update("cart.modify", vo);
   }


   

}