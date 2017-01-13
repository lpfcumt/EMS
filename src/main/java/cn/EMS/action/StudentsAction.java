package cn.EMS.action;

import java.text.SimpleDateFormat;
import java.util.Date;
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

	/*���ѧ���Ƿ��ظ�*/
	public String Check_StudentsId() throws Exception{
		Students students=studentsService.findById(model.getStudents_id());
		if (students==null) {
			 jsonMap.put("flag", true);
		}
		else {
			jsonMap.put("flag", false);
		}
		;
		
		return "Check_StudentsId";
		
	} 
	
	/*��������Ƿ��ظ�*/
	public String Check_StudentsEmail() throws Exception{
		Students students=studentsService.findByEmail(model.getStudents_email());
		if (students==null) {
			 jsonMap.put("flag", true);
		}
		else {
			jsonMap.put("flag", false);
		}
		;
		
		return "Check_StudentsEmail";
	}
	
	/*ѧ��ע��*/
	public String StudentsRegister() throws Exception{
		Date dt=new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time =format.format(dt);
		model.setStudents_time(time);
		studentsService.save(model);
		return SUCCESS;
		
	}
	
	/*����˺�����*/
	public String Check_StudentsLogin() throws Exception{
		Students students=studentsService.findByID_Password(model.getStudents_id(),model.getStudents_password());
		if (students==null) {
			 jsonMap.put("flag", false);
		}
		else {
			jsonMap.put("flag", true);
		}
		;
		
		return "Check_StudentsLogin";
	}
	
	/*ѧ����¼*/
	public String StudentsLogin() throws Exception{
		Students students=studentsService.findByID_Password(model.getStudents_id(),model.getStudents_password());
		session.put("students_id", students.getStudents_id());
		session.put("students_name", students.getStudents_name());
		session.put("students_email", students.getStudents_email());
		session.put("students_tel", students.getStudents_tel());
		return SUCCESS;
	}
}