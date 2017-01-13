package cn.EMS.service.impl;

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
}
