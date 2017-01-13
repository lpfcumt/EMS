package cn.EMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="experiments_unjoinstudents")
@Table(name="experiments_unjoinstudents")
public class Experiments_unjoinstudents {
	private int rowsid;
	private int experiments_id;
	private String students_name;
	
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
	public String getStudents_name() {
		return students_name;
	}
	public void setStudents_name(String students_name) {
		this.students_name = students_name;
	}
	
}
