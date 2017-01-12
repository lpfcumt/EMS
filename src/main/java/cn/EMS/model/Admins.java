package cn.EMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="admins")
@Table(name="admins")
public class Admins {
	private int rowsid;
	private int admins_id;
	private String admins_name;
	private String admins_tel;
	private String admins_email;
	private String admins_password;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getRowsid() {
		return rowsid;
	}
	public void setRowsid(int rowsid) {
		this.rowsid = rowsid;
	}
	
	@Column(nullable=false)
	public int getAdmins_id() {
		return admins_id;
	}
	public void setAdmins_id(int admins_id) {
		this.admins_id = admins_id;
	}
	
	@Column(nullable=false)
	public String getAdmins_name() {
		return admins_name;
	}
	public void setAdmins_name(String admins_name) {
		this.admins_name = admins_name;
	}
	
	@Column(nullable=false)
	public String getAdmins_tel() {
		return admins_tel;
	}
	public void setAdmins_tel(String admins_tel) {
		this.admins_tel = admins_tel;
	}
	
	@Column(nullable=false)
	public String getAdmins_email() {
		return admins_email;
	}
	public void setAdmins_email(String admins_email) {
		this.admins_email = admins_email;
	}
	
	@Column(nullable=false)
	public String getAdmins_password() {
		return admins_password;
	}
	public void setAdmins_password(String admins_password) {
		this.admins_password = admins_password;
	}
	
	
	
}
