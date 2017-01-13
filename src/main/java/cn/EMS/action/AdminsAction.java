package cn.EMS.action;

import java.util.HashMap;
import java.util.Map;

import cn.EMS.model.Admins;

public class AdminsAction extends BaseAction<Admins>{

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
	
	/*ºÏ≤È’À∫≈√‹¬Î*/
	public String Check_AdminLogin() throws Exception{
		Admins admins=adminsService.findById_Password(model.getAdmins_id(),model.getAdmins_password());
		if (admins==null) {
			 jsonMap.put("flag", false);
		}
		else {
			jsonMap.put("flag", true);
		}
		;
		
		return "Check_AdminLogin";
	}
	
	/*π‹¿Ì‘±µ«¬º*/
	public String AdminsLogin() throws Exception{
		Admins admins=adminsService.findById_Password(model.getAdmins_id(),model.getAdmins_password());
		session.put("admins_id", admins.getAdmins_id());
		session.put("admins_name", admins.getAdmins_name());
		session.put("admins_email", admins.getAdmins_email());
		session.put("admins_tel", admins.getAdmins_tel());
		return SUCCESS;
	}

}
