package com.product.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Component;

import com.product.model.ProductModel;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	public ProductModel insertDetail(ProductModel productModel){
		
			return productRepository.save(productModel);
		
	}

	public List<ProductModel> get(){
		try {
			return productRepository.findAll();
		} catch(Exception e) {
			return null;
		}
		
	}

	public Optional<ProductModel> getid(long id){
		try {
			return productRepository.findById(id);
		} catch(Exception e){
			return null;
		}
	}
	
	

	public ProductModel update(long id, ProductModel productModel) {
		try {
			productModel.setId(id);
			return productRepository.save(productModel);
		} catch(Exception e){
			return null;
		}
	}

	public void delete(long id) {
		try {
			productRepository.deleteById(id);
		} catch(Exception e){
		
		}
		
	}

}
