package cn.EMS.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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

	/*检查学号是否重复*/
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
	
	/*检查邮箱是否重复*/
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
	
	/*学生注册*/
	public String StudentsRegister() throws Exception{
		Date dt=new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time =format.format(dt);
		model.setStudents_time(time);
		studentsService.save(model);
		return SUCCESS;
		
	}
	
	/*检查账号密码*/
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
	
	/*学生登录*/
	public String StudentsLogin() throws Exception{
		Students students=studentsService.findByID_Password(model.getStudents_id(),model.getStudents_password());
		session.put("students_id", students.getStudents_id());
		session.put("students_name", students.getStudents_name());
		session.put("students_email", students.getStudents_email());
		session.put("students_tel", students.getStudents_tel());
		return SUCCESS;
	}
	
	/*根据学号输出学生*/
	public String ListStudentsById() throws Exception{
		List<Students> listStudentsById=studentsService.listById(model.getStudents_id());
		session.put("listStudentsById", listStudentsById);
		return SUCCESS;
	}
	
	/*根据名字输出学生*/
	public String ListStudentsByName() throws Exception{
		List<Students> listStudentsByName=studentsService.listByName(model.getStudents_name());
		session.put("listStudentsByName", listStudentsByName);
		return SUCCESS;
	}
	
	/*输出所有学生*/
	public String ListAllStudents() throws Exception{
		List<Students> listAllStudents=studentsService.query();
		session.put("listAllStudents", listAllStudents);
		return SUCCESS;
	}
}