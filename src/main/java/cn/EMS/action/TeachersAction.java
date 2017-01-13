package cn.EMS.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
}