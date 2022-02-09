package com.pool.elastic.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.pool.elastic.entity.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {
	public List<Product> findByName(String name);

	public List<Product> findByNameContaining(String name);

	public List<Product> findByManufacturerAndCategory(String manufacturer, String category);
}
