package abstractfactory.domain.userinfo.dao;

import abstractfactory.domain.userinfo.UserInfo;

public interface UserInfoDao {

	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInf(UserInfo userInfo);
}
