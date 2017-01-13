package cn.EMS.dao;

import java.util.List;

import cn.EMS.model.Students;

public interface StudentsDao extends BaseDao<Students>{

	List<Students> findById(int students_id);

	

	List<Students> findByEmail(String students_email);



	List<Students> findByID_Password(int students_id, String students_password);

}
