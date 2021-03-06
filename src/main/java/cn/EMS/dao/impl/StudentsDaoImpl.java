package cn.EMS.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.EMS.dao.StudentsDao;
import cn.EMS.model.Students;

@Repository("studentsDao")
public class StudentsDaoImpl extends BaseDaoImpl<Students> implements StudentsDao{

	@Override
	public List<Students> findById(int students_id) {
		// TODO Auto-generated method stub
		return findByHql("from students where students_id="+students_id);
	}

	

	@Override
	public List<Students> findByEmail(String students_email) {
		// TODO Auto-generated method stub
		return findByHql("from students where students_email="+students_email);
	}



	@Override
	public List<Students> findByID_Password(int students_id, String students_password) {
		// TODO Auto-generated method stub
		return findByHql("from students where students_id="+students_id+" and students_password='"+students_password+"'");
	}



	@Override
	public List<Students> listById(int students_id) {
		// TODO Auto-generated method stub
		return findByHql("from students where students_id="+students_id);
	}



	@Override
	public List<Students> listByName(String students_name) {
		// TODO Auto-generated method stub
		return findByHql("from students where students_name="+students_name);
	}



	@Override
	public void updatePassword(int students_id, String students_password, String newpassword) {
		// TODO Auto-generated method stub
		findByHql("update students s set s.students_password='"+newpassword+"',s.students_repassword='"+students_password+"' where s.students_id="+students_id);
	}



	@Override
	public void updateById(int students_id, String students_name, String students_email, String students_grade,
			String students_major, String students_school, String students_tel) {
		// TODO Auto-generated method stub
		findByHql("update students s set s.students_name='"+students_name+"',s.students_email='"+students_email+"',s.students_grade='"
				+ students_grade+"',s.students_major='"+students_major+"',s.students_school='"+students_school+"',s.students_tel='"+students_tel+"' where s.students_id="+students_id);
	}

}
