package cn.EMS.dao;


import java.util.List;

import cn.EMS.model.Teachers;

public interface TeachersDao extends BaseDao<Teachers>{

	List<Teachers> Query(int teachers_id, String teachers_password);

}
