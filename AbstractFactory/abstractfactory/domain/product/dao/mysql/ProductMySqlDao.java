package abstractfactory.domain.product.dao.mysql;

import abstractfactory.domain.product.Product;
import abstractfactory.domain.product.dao.ProductDao;
import abstractfactory.domain.userinfo.UserInfo;
import abstractfactory.domain.userinfo.dao.UserInfoDao;

public class ProductMySqlDao implements ProductDao{


	@Override
	public void insertProduct(Product product) {
		System.out.println("insert into MYSQL DB productId =" + product.getProductId() );			
	}

	@Override
	public void updateProduct(Product product) {
		System.out.println("update into MYSQL DB productId =" + product.getProductId() );		
	}

	@Override
	public void deleteProduct(Product product) {
		System.out.println("delete from MYSQL DB productId =" + product.getProductId() );		
	}

	

}
