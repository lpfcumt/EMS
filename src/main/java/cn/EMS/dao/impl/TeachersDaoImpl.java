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
		return findByHql("from teachers where teachers_id="+teachers_id+" and teachers_password='"+teachers_password+"'");
	}

	@Override
	public List<Teachers>  FindById(int teachers_id) {
		// TODO Auto-generated method stub
		return findByHql("from teachers where teachers_id="+teachers_id);
	}

	@Override
	public List<Teachers> FindByEmail(int teachers_email) {
		// TODO Auto-generated method stub
		return findByHql("from teachers where teachers_email='"+teachers_email+"'");
	}

	@Override
	public List<Teachers> listById(int teachers_id) {
		// TODO Auto-generated method stub
		return findByHql("from teachers where teachers_id="+teachers_id);
	}

	@Override
	public List<Teachers> listByname(String teachers_name) {
		// TODO Auto-generated method stub
		return findByHql("from teachers where teachers_name='"+teachers_name+"'");
	}

	@Override
	public void updateTeachersById(int teachers_id, String teachers_name, String teachers_email, String teachers_password,
			String teachers_repassword, String teachers_school, String teachers_sex, String teachers_tel) {
		// TODO Auto-generated method stub
		findByHql("update teachers t set t.teachers_name='"+teachers_name+"',t.teachers.name='"+teachers_name+"',t.teachers_email='"+teachers_email+"',t.teachers_password='"+teachers_password+"',t.teachers_repassword='"+teachers_repassword+"',t.teachers_school='"+teachers_school+"',t.teachers_sex='"+teachers_sex+"',t.teachers_tel='"+teachers_tel+"'where teachers_id="+teachers_id);
	}
}
