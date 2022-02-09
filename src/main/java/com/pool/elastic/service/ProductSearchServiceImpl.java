package com.pool.elastic.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;
import com.pool.elastic.entity.Product;
import com.pool.elastic.model.CommonResponse;
import com.pool.elastic.repository.ProductRepository;

@Service
public class ProductSearchServiceImpl implements ProductSearchService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ElasticsearchRestTemplate elasticsearchRestTemplate;
	
	@Autowired
	private ElasticsearchOperations elasticsearchOperations;

	@Override
	public CommonResponse createProductIndexBulk(List<Product> products) {
		productRepository.saveAll(products);
		return new CommonResponse();
	}

	@Override
	public CommonResponse createProductIndex(Product product) {
		productRepository.save(product);
		return new CommonResponse();
	}

}
