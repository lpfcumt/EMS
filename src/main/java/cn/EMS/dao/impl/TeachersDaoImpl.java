package cn.EMS.dao.impl;

import org.springframework.stereotype.Repository;

import cn.EMS.dao.TeachersDao;
import cn.EMS.model.Teachers;

@Repository("teachersDao")
public class TeachersDaoImpl extends BaseDaoImpl<Teachers> implements TeachersDao{

}
