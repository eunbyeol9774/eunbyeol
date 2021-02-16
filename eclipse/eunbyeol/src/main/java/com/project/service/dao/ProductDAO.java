package com.project.service.dao;


import java.util.List;

import com.project.vo.ProductVO;

public interface ProductDAO {
	
	List <ProductVO> listProduct();
	ProductVO detailProduct(int pid);
	 void updateProduct(ProductVO dto);
	 void deleteProduct(int pid);
	 void insertProduct(ProductVO dto);
	 String fileInfo(int pid);
}
