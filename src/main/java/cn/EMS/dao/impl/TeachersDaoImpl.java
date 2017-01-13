package cn.EMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.EMS.dao.TeachersDao;
import cn.EMS.model.Teachers;

@Repository("teachersDao")
public class TeachersDaoImpl extends BaseDaoImpl<Teachers> implements TeachersDao{
	@Override
	public List<Teachers> Query(int teachers_id, String teachers_password) {
		// TODO Auto-generated method stub
		return findByHql("from teachers where teachers_id='"+teachers_id+"' and teachers_password='"+teachers_password+"'");
	}
}
