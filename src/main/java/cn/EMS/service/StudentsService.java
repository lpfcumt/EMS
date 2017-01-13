package cn.EMS.service;

import java.util.List;

import cn.EMS.model.Students;

public interface StudentsService extends BaseService<Students> {

	Students findById(int students_id);

	Students findByEmail(String students_email);

	Students findByID_Password(int students_id, String students_password);

	List<Students> listById(int students_id);

}
