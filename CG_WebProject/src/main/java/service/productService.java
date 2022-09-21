package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.ProductEntity;
import repository.ProductsRepo;

@Service
public class productService {

	@Autowired
	ProductsRepo product;

	public boolean addProduct(String name, Integer price) {
		ProductEntity pe = new ProductEntity();
		pe.setProductName(name);
		pe.setProductPrice(price);
		product.save(pe);
		return true;
	}
}
