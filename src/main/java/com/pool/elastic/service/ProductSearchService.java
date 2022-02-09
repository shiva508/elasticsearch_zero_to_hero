package com.pool.elastic.service;

import java.util.List;

import com.pool.elastic.entity.Product;
import com.pool.elastic.model.CommonResponse;

public interface ProductSearchService {
	public CommonResponse createProductIndexBulk(List<Product> products);

	public CommonResponse createProductIndex(Product product);
}
