package com.project.service;

import java.util.List;

import com.project.vo.ProductVO;
public interface ProductService {
	
    List<ProductVO> listProduct();
		
    ProductVO detailProduct(int pid);
    String fileInfo(int pid);
    void updateProduct(ProductVO vo);
    void deleteProduct(int pid);
    void insertProduct(ProductVO vo);
}
