package cn.EMS.dao.impl;

import org.springframework.stereotype.Repository;

import cn.EMS.dao.AdminsDao;
import cn.EMS.model.Admins;

@Repository("adminsDao")
public class AdminsDaoImpl extends BaseDaoImpl<Admins> implements AdminsDao{

}
