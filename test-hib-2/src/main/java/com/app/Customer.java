package com.app;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="customer")
//@PrimaryKeyJoinColumn(name="user_id")
@DiscriminatorValue("CUSTOMER")
public class Customer extends User {
	@Basic
	@Column(name = "type", length = 100)
	String type;
	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Customer [type=" + type + "]";
	}
	
	
}
