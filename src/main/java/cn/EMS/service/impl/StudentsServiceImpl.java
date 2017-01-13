package cn.EMS.service.impl;

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

}
