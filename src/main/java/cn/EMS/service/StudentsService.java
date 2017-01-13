package cn.EMS.service;

import cn.EMS.model.Students;

public interface StudentsService extends BaseService<Students> {

	Students findById(int students_id);

}
