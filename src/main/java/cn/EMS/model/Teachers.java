package cn.EMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="teachers")
@Table(name="teachers")
public class Teachers {
	private int rowsid;
	private int teachers_id;
	private String teachers_name;
	private String teachers_password;
	private String teachers_repassword;
	private String teachers_sex;
	private String teachers_school;
	private String teachers_tel;
	private String teachers_email;
	private String teachers_time;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getRowsid() {
		return rowsid;
	}
	public void setRowsid(int rowsid) {
		this.rowsid = rowsid;
	}
	
	@Column(nullable=false)
	public int getTeachers_id() {
		return teachers_id;
	}
	public void setTeachers_id(int teachers_id) {
		this.teachers_id = teachers_id;
	}
	
	@Column(nullable=false)
	public String getTeachers_name() {
		return teachers_name;
	}
	public void setTeachers_name(String teachers_name) {
		this.teachers_name = teachers_name;
	}
	
	@Column(nullable=false)
	public String getTeachers_password() {
		return teachers_password;
	}
	public void setTeachers_password(String teachers_password) {
		this.teachers_password = teachers_password;
	}
	
	@Column
	public String getTeachers_repassword() {
		return teachers_repassword;
	}
	public void setTeachers_repassword(String teachers_repassword) {
		this.teachers_repassword = teachers_repassword;
	}
	
	@Column(nullable=false)
	public String getTeachers_sex() {
		return teachers_sex;
	}
	public void setTeachers_sex(String teachers_sex) {
		this.teachers_sex = teachers_sex;
	}
	
	@Column(nullable=false)
	public String getTeachers_school() {
		return teachers_school;
	}
	public void setTeachers_school(String teachers_school) {
		this.teachers_school = teachers_school;
	}
	
	@Column(nullable=false)
	public String getTeachers_tel() {
		return teachers_tel;
	}
	public void setTeachers_tel(String teachers_tel) {
		this.teachers_tel = teachers_tel;
	}
	
	@Column(nullable=false)
	public String getTeachers_email() {
		return teachers_email;
	}
	public void setTeachers_email(String teachers_email) {
		this.teachers_email = teachers_email;
	}
	
	@Column(nullable=false)
	public String getTeachers_time() {
		return teachers_time;
	}
	public void setTeachers_time(String teachers_time) {
		this.teachers_time = teachers_time;
	}
	
}
