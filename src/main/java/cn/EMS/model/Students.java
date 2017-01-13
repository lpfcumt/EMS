package cn.EMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="students")
@Table(name="students")
public class Students {
	private int rowid;
	private int students_id;
	private String students_name;
	private String students_password;
	
	private String students_email;
	private String students_tel;
	private String students_grade;
	private String students_major;
	private String students_school;
	private String sutdents_sex;
	private String students_time;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getRowid() {
		return rowid;
	}
	public void setRowid(int rowid) {
		this.rowid = rowid;
	}
	
	@Column(nullable=false)
	public int getStudents_id() {
		return students_id;
	}
	public void setStudents_id(int students_id) {
		this.students_id = students_id;
	}
	
	@Column(nullable=false)
	public String getStudents_name() {
		return students_name;
	}
	public void setStudents_name(String students_name) {
		this.students_name = students_name;
	}
	
	@Column(nullable=false)
	public String getStudents_password() {
		return students_password;
	}
	public void setStudents_password(String students_password) {
		this.students_password = students_password;
	}
	
	
	
	@Column(nullable=false)
	public String getStudents_email() {
		return students_email;
	}
	public void setStudents_email(String students_email) {
		this.students_email = students_email;
	}
	
	@Column(nullable=false)
	public String getStudents_tel() {
		return students_tel;
	}
	public void setStudents_tel(String students_tel) {
		this.students_tel = students_tel;
	}
	
	@Column(nullable=false)
	public String getStudents_grade() {
		return students_grade;
	}
	public void setStudents_grade(String students_grade) {
		this.students_grade = students_grade;
	}
	
	@Column(nullable=false)
	public String getStudents_major() {
		return students_major;
	}
	public void setStudents_major(String students_major) {
		this.students_major = students_major;
	}
	
	@Column(nullable=false)
	public String getStudents_school() {
		return students_school;
	}
	public void setStudents_school(String students_school) {
		this.students_school = students_school;
	}
	
	@Column(nullable=false)
	public String getSutdents_sex() {
		return sutdents_sex;
	}
	public void setSutdents_sex(String sutdents_sex) {
		this.sutdents_sex = sutdents_sex;
	}
	
	@Column(nullable=false)
	public String getStudents_time() {
		return students_time;
	}
	public void setStudents_time(String students_time) {
		this.students_time = students_time;
	}
	
}
