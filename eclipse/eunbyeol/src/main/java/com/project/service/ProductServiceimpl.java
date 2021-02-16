package com.project.service;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.service.dao.ProductDAO;
import com.project.vo.ProductVO;


@Service
public class ProductServiceimpl implements ProductService {
	
	@Resource(name = "ProductDAO")
	ProductDAO productDao;
	
	@Override
	public List<ProductVO> listProduct() {
		return productDao.listProduct();
	}

	@Override
	public ProductVO detailProduct(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fileInfo(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(ProductVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertProduct(ProductVO vo) {
		// TODO Auto-generated method stub
		
	}
}