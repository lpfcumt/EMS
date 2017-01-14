package cn.EMS.service;

import java.util.List;

import cn.EMS.model.Teachers;

public interface TeachersService extends BaseService<Teachers> {

	Teachers Query(int teachers_id, String teachers_password);

	Teachers FindById(int teachers_id);

	Teachers FindByEmail(int teachers_id);

	List<Teachers> listById(int teachers_id);

	List<Teachers> listByName(String teachers_name);

	void updateTeachersById(int teachers_id, String teachers_name, String teachers_email, String teachers_password,
			String teachers_repassword, String teachers_school, String teachers_sex, String teachers_tel);
	
	

}
