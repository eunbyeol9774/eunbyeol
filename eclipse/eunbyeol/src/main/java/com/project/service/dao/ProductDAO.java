package com.project.service.dao;


import java.util.List;

import com.project.vo.ProductVO;

public interface ProductDAO {
	
	List <ProductVO> listProduct() throws Exception;
}
