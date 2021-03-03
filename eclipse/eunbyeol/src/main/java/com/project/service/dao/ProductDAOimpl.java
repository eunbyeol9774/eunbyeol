package com.project.service.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.vo.ProductVO;


@Repository("ProductDAO")

public class ProductDAOimpl implements ProductDAO {
	
	@Inject
	private SqlSession sqlSession;
	 
	    @Override
	    public List<ProductVO> listProduct() {
	        return sqlSession.selectList("product.listProduct"); 
	
}

	
}