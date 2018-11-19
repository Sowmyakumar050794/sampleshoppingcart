package com.teamsankya.sampleshoppingcart.controller;

import java.util.List;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.teamsankya.sampleshoppingcart.dao.ProductDAO;
import com.teamsankya.sampleshoppingcart.dto.ProductsBean;


@Controller
public class ProductController {
	
	@Autowired
	@Qualifier("dao")
	ProductDAO productdao;
	
	
	final static Logger LOGGER = Logger.getLogger(ProductController.class);
	
	@RequestMapping(path = "/searchproduct", method = RequestMethod.GET)
	public String searchProduct(ModelMap map, String search) {
		System.out.println("inside controller");
		LOGGER.info("inside lot controller");
		LOGGER.info(search);
		System.out.println("before calling dao method");
		List<ProductsBean> products = productdao.search(search);
		map.addAttribute("productsbean", products);
		
		return "SearchResult";
	}
	
	
}
