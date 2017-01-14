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
	
	/*����ְ��ѧ���Ƿ��ظ�*/

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
	 
	 /*����ְ�������Ƿ��ظ�*/
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
	 
	/*��ʦע��*/
	public String TeachersRegister() throws Exception{
		Date dt=new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time =format.format(dt);
		model.setTeachers_time(time);
		teachersService.save(model);
		return SUCCESS;
	}
	
	/*��ʦ��¼*/
	public String TeachersLogin() throws Exception{
		Teachers teachers=teachersService.Query(model.getTeachers_id(),model.getTeachers_password());
		session.put("teachers_id",teachers.getTeachers_id());
		session.put("teachers_name", teachers.getTeachers_name());
		session.put("teacher_email", teachers.getTeachers_email());
		session.put("teachers_tel", teachers.getTeachers_tel());
		return SUCCESS;	
	}
	
	/*����ʦ�˺�����*/
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
	
	/*���ݽ�ְ���������ʦ*/
	public String ListTeachersById() throws Exception{
		List<Teachers> listTeachersById=teachersService.listById(model.getTeachers_id());
		session.put("listTeachersById", listTeachersById);
		return SUCCESS;
	}
	/*�������������ʦ*/
	public String ListTeachersByName() throws Exception{
		List<Teachers> listTeachersByName=teachersService.listByName(model.getTeachers_name());
		session.put("listTeachersByName", listTeachersByName);
		return SUCCESS;
	}
	/*�������ѧ��*/
	public String ListAllTeachers() throws Exception{
		List<Teachers> listAllTeachers=teachersService.listByName(model.getTeachers_name());
		session.put("listAllTeachers", listAllTeachers);
		return SUCCESS;
	}
	/*��ʦ�޸ĸ�����Ϣ*/
	public String updateTeachersById() throws Exception{
		 teachersService.updateTeachersById(model.getTeachers_id(),model.getTeachers_name(),
				 model.getTeachers_email(),model.getTeachers_password(),model.getTeachers_repassword(),
				 model.getTeachers_school(),model.getTeachers_sex(),model.getTeachers_tel());      	
		return SUCCESS;
		
		
	}
}