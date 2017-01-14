package cn.EMS.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;

import cn.EMS.model.Teachers;


@SuppressWarnings("serial")
@Controller("teachersAction")
public class TeachersAction extends BaseAction<Teachers>{
	private Map<String, Object> jsonMap=new HashMap<String, Object>();
	public Map<String, Object> getJsonMap() {
		return jsonMap;
	}
	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}
	
	/*检查教职工学号是否重复*/

	 public String Check_TeachersId() throws Exception{
		 Teachers teachers=teachersService.FindById(model.getTeachers_id());
		 if (teachers==null) {
			 jsonMap.put("flag", true);
		}
		 else{
			 jsonMap.put("flag", false);
		 }
		 return "Check_TeachersId";
	 }
	 
	 /*检查教职工邮箱是否重复*/
	 public String Check_TeachersEmail() throws Exception{
		 Teachers teachers=teachersService.FindByEmail(model.getTeachers_id());
		 if (teachers==null) {
			 jsonMap.put("flag", true);
		}
		 else{
			 jsonMap.put("flag", false);
		 }
		 return "Check_TeachersEmail";
	 }
	 
	/*教师注册*/
	public String TeachersRegister() throws Exception{
		Date dt=new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time =format.format(dt);
		model.setTeachers_time(time);
		teachersService.save(model);
		return SUCCESS;
	}
	
	/*教师登录*/
	public String TeachersLogin() throws Exception{
		Teachers teachers=teachersService.Query(model.getTeachers_id(),model.getTeachers_password());
		session.put("teachers_id",teachers.getTeachers_id());
		session.put("teachers_name", teachers.getTeachers_name());
		session.put("teacher_email", teachers.getTeachers_email());
		session.put("teachers_tel", teachers.getTeachers_tel());
		return SUCCESS;	
	}
	
	/*检查教师账号密码*/
	public String Check_TeachersLogin() throws Exception{
		Teachers teachers=teachersService.Query(model.getTeachers_id(),model.getTeachers_password());
		if (teachers==null) {
			jsonMap.put("flag", false);	
	}
	    else{
		    jsonMap.put("flag", true);	
   }
		return "Check_TeachersLogin";
  }
	
	/*根据教职工号输出老师*/
	public String ListTeachersById() throws Exception{
		List<Teachers> listTeachersById=teachersService.listById(model.getTeachers_id());
		session.put("listTeachersById", listTeachersById);
		return SUCCESS;
	}
	/*根据名字输出老师*/
	public String ListTeachersByName() throws Exception{
		List<Teachers> listTeachersByName=teachersService.listByName(model.getTeachers_name());
		session.put("listTeachersByName", listTeachersByName);
		return SUCCESS;
	}
	/*输出所有学生*/
	public String ListAllTeachers() throws Exception{
		List<Teachers> listAllTeachers=teachersService.listByName(model.getTeachers_name());
		session.put("listAllTeachers", listAllTeachers);
		return SUCCESS;
	}
	/*教师修改个人信息*/
	public String updateTeachersById() throws Exception{
		 teachersService.updateTeachersById(model.getTeachers_id(),model.getTeachers_name(),
				 model.getTeachers_email(),model.getTeachers_password(),model.getTeachers_repassword(),
				 model.getTeachers_school(),model.getTeachers_sex(),model.getTeachers_tel());      	
		return SUCCESS;
		
		
	}
}