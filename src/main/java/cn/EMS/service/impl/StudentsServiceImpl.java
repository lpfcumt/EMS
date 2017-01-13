package cn.EMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.EMS.model.Students;
import cn.EMS.service.StudentsService;
@Service("studentsService")
public class StudentsServiceImpl extends BaseServiceImpl<Students>  implements StudentsService{

	@Override
	public Students findById(int students_id) {
		// TODO Auto-generated method stub
		if(!studentsDao.findById(students_id).isEmpty()){
			return studentsDao.findById(students_id).get(0);
		}
		else {
			return null;
		}
	}

	@Override
	public Students findByEmail(String students_email) {
		// TODO Auto-generated method stub
		if(!studentsDao.findByEmail(students_email).isEmpty()){
			return studentsDao.findByEmail(students_email).get(0);
		}
		else {
			return null;
		}
	}

	@Override
	public Students findByID_Password(int students_id, String students_password) {
		// TODO Auto-generated method stub
		if(!studentsDao.findByID_Password(students_id,students_password).isEmpty()){
			return studentsDao.findByID_Password(students_id,students_password).get(0);
		}
		else {
			return null;
		}
	}

	@Override
	public List<Students> listById(int students_id) {
		// TODO Auto-generated method stub
		return studentsDao.listById(students_id);
	}

	@Override
	public List<Students> listByName(String students_name) {
		// TODO Auto-generated method stub
		return studentsDao.listByName(students_name);
	}

	@Override
	public void updatePassword(int students_id, String students_password, String newpassword) {
		// TODO Auto-generated method stub
		studentsDao.updatePassword(students_id,students_password,newpassword);
	}

	@Override
	public void updateById(int students_id, String students_name, String students_email, String students_grade,
			String students_major, String students_school, String students_tel) {
		// TODO Auto-generated method stub
		studentsDao.updateById(students_id,students_name,students_email,students_grade,students_major,students_school,students_tel);
	}

}
