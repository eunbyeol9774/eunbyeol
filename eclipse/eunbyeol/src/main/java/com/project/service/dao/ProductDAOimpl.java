package com.project.service.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.vo.ProductVO;


@Repository("ProductDAO")

public class ProductDAOimpl implements ProductDAO {
	@Inject
	    SqlSession sqlSession; 
	 
	    @Override
	    public List<ProductVO> listProduct() {
	        return sqlSession.selectList("product.list_product"); 
	
}

		@Override
		public ProductVO detailProduct(int pid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void updateProduct(ProductVO dto) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteProduct(int pid) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertProduct(ProductVO dto) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String fileInfo(int pid) {
			// TODO Auto-generated method stub
			return null;
		}
}