package com.kpaydeveloper.aplikasimarbot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Employee extends com.kindsonthegenius.fleetapp.models.Person {
		
	@ManyToOne
	@JoinColumn(name="employeetypeid", insertable=false, updatable=false)
	private EmployeeType employeeType;
	private Integer employeetypeid;
	private String photo;
	private String username;
	
	@ManyToOne
	@JoinColumn(name="jobtitleid", insertable=false, updatable=false)
	private com.kindsonthegenius.fleetapp.models.JobTitle jobTitle;
	private Integer jobtitleid;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private Date hireDate;
}
