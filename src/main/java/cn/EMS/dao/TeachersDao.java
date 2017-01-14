package cn.EMS.dao;


import java.util.List;

import cn.EMS.model.Teachers;

public interface TeachersDao extends BaseDao<Teachers>{

	List<Teachers> Query(int teachers_id, String teachers_password);

	List<Teachers> FindById(int teachers_id);
	List<Teachers> FindByEmail(int teachers_email);

	List<Teachers> listById(int teachers_id);

	List<Teachers> listByname(String teachers_name);

	void updateTeachersById(int teachers_id, String teachers_name, String teachers_email, String teachers_password,
			String teachers_repassword, String teachers_school, String teachers_sex, String teachers_tel);

}
