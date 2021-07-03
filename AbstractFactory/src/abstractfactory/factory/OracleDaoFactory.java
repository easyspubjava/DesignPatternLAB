package abstractfactory.factory;

import abstractfactory.domain.product.dao.ProductDao;
import abstractfactory.domain.product.dao.oracle.ProductOracleDao;
import abstractfactory.domain.userinfo.dao.UserInfoDao;
import abstractfactory.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class OracleDaoFactory extends DaoFactory{

	@Override
	public UserInfoDao createUserInfoDao() {
		return new UserInfoOracleDao();
	}

	@Override
	public ProductDao createProductDao() {
		return new ProductOracleDao();
	}

}
