package com.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.ProductModel;
import com.product.service.ProductService;

@CrossOrigin
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("product")
	public ProductModel insert(@RequestBody ProductModel productModel) {
		return productService.insertDetail(productModel);

	}

	@GetMapping("product")
	public List<ProductModel> getall() {
		return productService.get();
	}

	@GetMapping("product/{id}")
	public Optional<ProductModel> getById(@PathVariable long id) {
		return productService.getid(id);
	}

	@PutMapping("product/{id}")
	public ProductModel update(@PathVariable long id, @RequestBody ProductModel productModel) {
		return productService.update(id, productModel);
	}

	@DeleteMapping("product/{id}")
	public void deleteById(@PathVariable long id) {
		productService.delete(id);

	}


}
