package cn.EMS.dao;

import java.util.List;

import cn.EMS.model.Students;

public interface StudentsDao extends BaseDao<Students>{

	List<Students> findById(int students_id);

}
