package cn.EMS.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="experiments_screenings")
@Table(name="experiments_screenings")
public class Experiments_screenings {
	private int rowsid;
	private int experiments_id;
	private int experiments_screenings;
	private Date experiments_starttime;
	private Date experiments_endtime;
	private int experiments_duration;//Ê±³¤
	private int experiments_needstudents;
	private String experiments_field;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getRowsid() {
		return rowsid;
	}
	public void setRowsid(int rowsid) {
		this.rowsid = rowsid;
	}
	
	@Column
	public int getExperiments_id() {
		return experiments_id;
	}
	public void setExperiments_id(int experiments_id) {
		this.experiments_id = experiments_id;
	}
	
	@Column
	public int getExperiments_screenings() {
		return experiments_screenings;
	}
	public void setExperiments_screenings(int experiments_screenings) {
		this.experiments_screenings = experiments_screenings;
	}
	
	
	@Column
	public Date getExperiments_starttime() {
		return experiments_starttime;
	}
	public void setExperiments_starttime(Date experiments_starttime) {
		this.experiments_starttime = experiments_starttime;
	}
	
	@Column
	public Date getExperiments_endtime() {
		return experiments_endtime;
	}
	public void setExperiments_endtime(Date experiments_endtime) {
		this.experiments_endtime = experiments_endtime;
	}
	
	@Column
	public int getExperiments_duration() {
		return experiments_duration;
	}
	public void setExperiments_duration(int experiments_duration) {
		this.experiments_duration = experiments_duration;
	}
	@Column
	public int getExperiments_needstudents() {
		return experiments_needstudents;
	}
	public void setExperiments_needstudents(int experiments_needstudents) {
		this.experiments_needstudents = experiments_needstudents;
	}
	
	@Column
	public String getExperiments_field() {
		return experiments_field;
	}
	public void setExperiments_field(String experiments_field) {
		this.experiments_field = experiments_field;
	}
	
}
