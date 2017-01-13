package cn.EMS.service;

import cn.EMS.model.Students;

public interface StudentsService extends BaseService<Students> {

	Students findById(int students_id);

	Students findByEmail(String students_email);

	Students findByID_Password(int students_id, String students_password);

}
