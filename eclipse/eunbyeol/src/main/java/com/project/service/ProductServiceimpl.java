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
	public List<ProductVO> listProduct() throws Exception {
		return productDao.listProduct();
	}
	
	@Override
	public ProductVO detailProduct(int pid) {
		return productDao.detailProduct(pid);
	}


}