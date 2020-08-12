package com.app;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="agent")
//@PrimaryKeyJoinColumn(name="user_id")
@DiscriminatorValue("AGENT")
public class Agent extends User {

	@Basic
	@Column(name = "type", length = 100)
	String type;

	@Basic
	@Column(name = "dept", length = 100)
	String dept;

	@Basic
	@Column(nullable = false, columnDefinition = "BOOLEAN default '0'")
	private Boolean prepaid;

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

	public Boolean getPrepaid() {
		return prepaid;
	}

	public void setPrepaid(Boolean prepaid) {
		this.prepaid = prepaid;
	}

	@Override
	public String toString() {
		return "Agent [type=" + type + ", dept=" + dept + ", prepaid="
				+ prepaid + "]";
	}

}
