package cn.EMS.dao.impl;

import org.springframework.stereotype.Repository;

import cn.EMS.dao.StudentsDao;
import cn.EMS.model.Students;

@Repository("studentsDao")
public class StudentsDaoImpl extends BaseDaoImpl<Students> implements StudentsDao{

}
