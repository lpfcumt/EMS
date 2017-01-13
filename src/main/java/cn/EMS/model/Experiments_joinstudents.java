package cn.EMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="experiments_joinstudents")
@Table(name="experiments_joinstudents")
public class Experiments_joinstudents {
    private int rowsid;
    private int experiments_id;
    private int experiments_screenings;
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
	public int getExperiments_screenings() {
		return experiments_screenings;
	}
	public void setExperiments_screenings(int experiments_screenings) {
		this.experiments_screenings = experiments_screenings;
	}
	
	@Column
	public String getStudents_name() {
		return students_name;
	}
	public void setStudents_name(String students_name) {
		this.students_name = students_name;
	}
    
}
