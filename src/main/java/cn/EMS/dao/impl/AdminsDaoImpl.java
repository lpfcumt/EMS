package cn.EMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.EMS.dao.AdminsDao;
import cn.EMS.model.Admins;

@Repository("adminsDao")
public class AdminsDaoImpl extends BaseDaoImpl<Admins> implements AdminsDao{

	@Override
	public List<Admins> findById_Password(int admins_id, String admins_password) {
		// TODO Auto-generated method stub
		return findByHql("from admins where admins_id="+admins_id+" and admins_password='"+admins_password+"'");
	}

}
