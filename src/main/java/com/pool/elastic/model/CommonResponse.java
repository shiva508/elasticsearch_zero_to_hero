package com.pool.elastic.model;

import java.util.ArrayList;
import java.util.List;

import com.pool.elastic.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse {
	private String message;
	private List<Product> products = new ArrayList<>();

	public CommonResponse() {

	}

	public String getMessage() {
		return message;
	}

	public CommonResponse setMessage(String message) {
		this.message = message;
		return this;
	}

	public List<Product> getProducts() {
		return products;
	}

	public CommonResponse setProducts(List<Product> products) {
		this.products = products;
		return this;
	}

}
