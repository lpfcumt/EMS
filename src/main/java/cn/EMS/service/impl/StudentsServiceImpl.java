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

}
