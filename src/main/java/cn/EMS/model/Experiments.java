package cn.EMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="experiments")
@Table(name="experiments")
public class Experiments {
	private int experiments_id;
	private String experiments_cate;
	private String experiments_name;
	private String experiments_outline;
	private String experiments_detail;
	private String experiments_requirement;//实验要求	
	private String experiments_credit;//学分
	private String experiments_pay;//费用
	private String experiments_principals;//负责人
	private String experiments_url;
	private String experiments_field;
	private String experiments_setting;
	private int experiments_screenings;
	private String experiments_state;
	private String experiments_createtime;
	private int teachers_id;
	private String teachers_name;
	private String teachers_email;
	private	String teachers_tel;
	
	@Id
	public int getExperiments_id() {
		return experiments_id;
	}
	public void setExperiments_id(int experiments_id) {
		this.experiments_id = experiments_id;
	}
	
	@Column
	public String getExperiments_cate() {
		return experiments_cate;
	}
	public void setExperiments_cate(String experiments_cate) {
		this.experiments_cate = experiments_cate;
	}
	
	@Column
	public String getExperiments_name() {
		return experiments_name;
	}
	public void setExperiments_name(String experiments_name) {
		this.experiments_name = experiments_name;
	}
	
	@Column
	public String getExperiments_outline() {
		return experiments_outline;
	}
	public void setExperiments_outline(String experiments_outline) {
		this.experiments_outline = experiments_outline;
	}
	
	@Column
	public String getExperiments_detail() {
		return experiments_detail;
	}
	public void setExperiments_detail(String experiments_detail) {
		this.experiments_detail = experiments_detail;
	}
	
	@Column
	public String getExperiments_requirement() {
		return experiments_requirement;
	}
	public void setExperiments_requirement(String experiments_requirement) {
		this.experiments_requirement = experiments_requirement;
	}
	
	@Column
	public String getExperiments_credit() {
		return experiments_credit;
	}
	public void setExperiments_credit(String experiments_credit) {
		this.experiments_credit = experiments_credit;
	}
	
	@Column
	public String getExperiments_pay() {
		return experiments_pay;
	}
	public void setExperiments_pay(String experiments_pay) {
		this.experiments_pay = experiments_pay;
	}
	
	@Column
	public String getExperiments_principals() {
		return experiments_principals;
	}
	public void setExperiments_principals(String experiments_principals) {
		this.experiments_principals = experiments_principals;
	}
	
	@Column
	public String getExperiments_url() {
		return experiments_url;
	}
	public void setExperiments_url(String experiments_url) {
		this.experiments_url = experiments_url;
	}
	
	@Column
	public String getExperiments_field() {
		return experiments_field;
	}
	public void setExperiments_field(String experiments_field) {
		this.experiments_field = experiments_field;
	}
	
	@Column
	public String getExperiments_setting() {
		return experiments_setting;
	}
	public void setExperiments_setting(String experiments_setting) {
		this.experiments_setting = experiments_setting;
	}
	
	@Column
	public int getExperiments_screenings() {
		return experiments_screenings;
	}
	public void setExperiments_screenings(int experiments_screenings) {
		this.experiments_screenings = experiments_screenings;
	}
	
	@Column
	public String getExperiments_state() {
		return experiments_state;
	}
	public void setExperiments_state(String experiments_state) {
		this.experiments_state = experiments_state;
	}
	
	@Column
	public String getExperiments_createtime() {
		return experiments_createtime;
	}
	public void setExperiments_createtime(String experiments_createtime) {
		this.experiments_createtime = experiments_createtime;
	}
	
	@Column
	public int getTeachers_id() {
		return teachers_id;
	}
	public void setTeachers_id(int teachers_id) {
		this.teachers_id = teachers_id;
	}
	
	@Column
	public String getTeachers_name() {
		return teachers_name;
	}
	public void setTeachers_name(String teachers_name) {
		this.teachers_name = teachers_name;
	}
	
	@Column
	public String getTeachers_email() {
		return teachers_email;
	}
	public void setTeachers_email(String teachers_email) {
		this.teachers_email = teachers_email;
	}
	
	@Column
	public String getTeachers_tel() {
		return teachers_tel;
	}
	public void setTeachers_tel(String teachers_tel) {
		this.teachers_tel = teachers_tel;
	}
	
}
