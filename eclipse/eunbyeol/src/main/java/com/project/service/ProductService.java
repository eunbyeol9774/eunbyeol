package com.project.service;

import java.util.List;

import com.project.vo.ProductVO;
public interface ProductService {
	
	List <ProductVO> listProduct() throws Exception;

}
