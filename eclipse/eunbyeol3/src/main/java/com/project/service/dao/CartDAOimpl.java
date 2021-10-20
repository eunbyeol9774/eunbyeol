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
   public void insertCart(CartVO vo) {
	   sql.insert("cartMapper.insertCart",vo);
   }
   
   
   @Override // ����
   public void delete(int cart_id) {
       sql.delete("cartMapper.delete", cart_id);
   }

   @Override // ��ǰ ���� ����
   public void updateCart(CartVO vo) {
   	sql.selectOne("cartMapper.sumCart", vo);

   }

   @Override // �հ�
   public int sumMoney(String userid) {
       return sql.selectOne("cartMapper.sumMoney", userid); 
   }

   @Override // ������ ��ǰ ���ڵ� Ȯ��
   public int countCart(String userid, int pid) {
       return 0;
   }


   @Override // ����
   public void modifyCart(CartVO vo) {
       sql.update("cartMapper.modify", vo);
   }


   

}