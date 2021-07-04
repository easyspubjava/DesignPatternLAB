package abstractfactory.factory;

import abstractfactory.domain.product.dao.ProductDao;
import abstractfactory.domain.userinfo.dao.UserInfoDao;

public abstract class DaoFactory {

	public abstract UserInfoDao createUserInfoDao();
	public abstract ProductDao createProductDao();
}
