package cn.EMS.model;

import javax.persistence.Entity;
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

}
