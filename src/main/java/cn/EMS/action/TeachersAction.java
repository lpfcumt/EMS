package cn.EMS.action;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import cn.EMS.model.Teachers;

@SuppressWarnings("serial")
@Controller("teachersAction")
public class TeachersAction extends BaseAction<Teachers>{
	private int teachers_id;
	private String teachers_name;
	private String teachers_password;
	private String teachers_sex;
	private String teachers_school;
	private String teachers_tel;
	private String teachers_email;
	private String teachers_time;
	private Map<String, Object> jsonMap=new HashMap<String, Object>();
	public int getTeachers_id() {
		return teachers_id;
	}
	public void setTeachers_id(int teachers_id) {
		this.teachers_id = teachers_id;
	}
	public String getTeachers_name() {
		return teachers_name;
	}
	public void setTeachers_name(String teachers_name) {
		this.teachers_name = teachers_name;
	}
	public String getTeachers_password() {
		return teachers_password;
	}
	public void setTeachers_password(String teachers_password) {
		this.teachers_password = teachers_password;
	}
	public String getTeachers_sex() {
		return teachers_sex;
	}
	public void setTeachers_sex(String teachers_sex) {
		this.teachers_sex = teachers_sex;
	}
	public String getTeachers_school() {
		return teachers_school;
	}
	public void setTeachers_school(String teachers_school) {
		this.teachers_school = teachers_school;
	}
	public String getTeachers_tel() {
		return teachers_tel;
	}
	public void setTeachers_tel(String teachers_tel) {
		this.teachers_tel = teachers_tel;
	}
	public String getTeachers_email() {
		return teachers_email;
	}
	public void setTeachers_email(String teachers_email) {
		this.teachers_email = teachers_email;
	}
	public String getTeachers_time() {
		return teachers_time;
	}
	public void setTeachers_time(String teachers_time) {
		this.teachers_time = teachers_time;
	}
	public Map<String, Object> getJsonMap() {
		return jsonMap;
	}
	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}
	//实验老师登录
	public String login() throws Exception{
		Teachers teachers=null;
		teachers.setTeachers_id(teachers_id);
		teachers.setTeachers_password(teachers_password);
		teachers=teachersService.Query(teachers_id,teachers_password);
		if (teachers ==null){
			jsonMap.put("flag", false);
		}
		else {
			jsonMap.put("flag", true);
		}
		return SUCCESS;
		
	}
	
}
