package com.pool.elastic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.pool.elastic.entity.Product;
import com.pool.elastic.model.CommonResponse;
import com.pool.elastic.service.ProductSearchService;

@RestController
public class ElasticSearchContoller {

	@Autowired
	private ProductSearchService productSearchService;

	@PostMapping("/savebulkdata")
	public CommonResponse createProductIndexBulk(@RequestBody List<Product> products) {
		return productSearchService.createProductIndexBulk(products);
	}

	@PostMapping("saveproduct")
	public CommonResponse createProductIndex(@RequestBody Product product) {
		return productSearchService.createProductIndex(product);
	}
}
