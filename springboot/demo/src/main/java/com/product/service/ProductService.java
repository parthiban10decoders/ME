package com.product.service;

import java.util.List;
import java.util.Optional;

//import org.hibernate.service.spi.ServiceException;
import com.product.model.ProductModel;

public interface ProductService {
	public ProductModel insertDetail(ProductModel productModel);

	public List<ProductModel> get();

	public Optional<ProductModel> getid(long id);

	public ProductModel update(long id, ProductModel productModel);

	public void delete(long id);
}
