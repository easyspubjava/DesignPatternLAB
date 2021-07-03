package abstractfactory.domain.product.dao;

import abstractfactory.domain.product.Product;

public interface ProductDao {

	void insertProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(Product prodcut);
}
