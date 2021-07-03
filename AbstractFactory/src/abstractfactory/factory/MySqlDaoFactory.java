package abstractfactory.factory;

import abstractfactory.domain.product.dao.ProductDao;
import abstractfactory.domain.product.dao.mysql.ProductMySqlDao;
import abstractfactory.domain.userinfo.dao.UserInfoDao;
import abstractfactory.domain.userinfo.dao.mysql.UserInfoMySqlDao;

public class MySqlDaoFactory extends DaoFactory{

	@Override
	public UserInfoDao createUserInfoDao() {
		return new UserInfoMySqlDao();
	}

	@Override
	public ProductDao createProductDao() {
		return new ProductMySqlDao();
	}



}
