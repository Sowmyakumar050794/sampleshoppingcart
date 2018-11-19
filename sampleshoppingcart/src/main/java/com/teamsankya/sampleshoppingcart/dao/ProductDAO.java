package com.teamsankya.sampleshoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.teamsankya.sampleshoppingcart.dto.ProductsBean;
@Service
public interface ProductDAO {
	public List<ProductsBean> search(String name); 
	}
