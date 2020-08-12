package com.app;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="employee")
//@PrimaryKeyJoinColumn(name="user_id")
@DiscriminatorValue("EMPLOYEE")
public class Employee extends User {

	@Basic
	@Column(name = "type", length = 100)
	String type;
	
	@Basic
	@Column(name = "dept", length = 100)
	String dept;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [type=" + type + ", dept=" + /*dept*/"" + "]";
	}
	
	
	
	
}
