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
	private String experiments_requirement;//ʵ��Ҫ��	
	private String experiments_credit;//ѧ��
	private String experiments_pay;//����
	private String experiments_principals;//������
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
