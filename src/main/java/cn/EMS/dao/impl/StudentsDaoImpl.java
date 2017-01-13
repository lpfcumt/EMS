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

}
