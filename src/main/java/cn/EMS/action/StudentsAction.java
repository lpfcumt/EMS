package cn.EMS.action;

import java.util.HashMap;
import java.util.Map;

import cn.EMS.model.Students;

public class StudentsAction extends BaseAction<Students>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> jsonMap=new HashMap<String, Object>();

	public Map<String, Object> getJsonMap() {
		return jsonMap;
	}

	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}

	
	public String Check_StudentsId() throws Exception{
		Students students=studentsService.findById(model.getStudents_id());
		return null;
		
	} 
}
