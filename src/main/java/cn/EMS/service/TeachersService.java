package cn.EMS.service;

import cn.EMS.model.Teachers;

public interface TeachersService extends BaseService<Teachers> {

	Teachers Query(int teachers_id, String teachers_password);
	
	

}
