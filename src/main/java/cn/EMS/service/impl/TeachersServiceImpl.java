package cn.EMS.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import cn.EMS.model.Teachers;
import cn.EMS.service.TeachersService;
@Service("adminsService")
public class TeachersServiceImpl extends BaseServiceImpl<Teachers> implements TeachersService {
	@Override
	public Teachers Query(int teachers_id, String teachers_password) {
		// TODO Auto-generated method stub9
		if (!teachersDao.Query(teachers_id,teachers_password).isEmpty()){
			return teachersDao.Query(teachers_id,teachers_password).get(0);
		}else {
			return null;
		}
    }
	@Override
	public Teachers FindById(int teachers_id) {
		if (!teachersDao.FindById(teachers_id).isEmpty()){
			return teachersDao.FindById(teachers_id).get(0);
		}else {
			return null;
		}
	}
	@Override
	public Teachers FindByEmail(int teachers_id) {
		if (!teachersDao.FindByEmail(teachers_id).isEmpty()){
			return teachersDao.FindByEmail(teachers_id).get(0);
		}else {
			return null;
		}
	}
	@Override
	public List<Teachers> listById(int teachers_id) {
		// TODO Auto-generated method stub
		return teachersDao.listById(teachers_id);
	}
	@Override
	public List<Teachers> listByName(String teachers_name) {
		// TODO Auto-generated method stub
		return teachersDao.listByname(teachers_name);
	}
}
