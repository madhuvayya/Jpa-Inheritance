package com.hm.hibernateinheritence.table_per_class;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bus")
public class Bus extends Vehicle {

	private String busModel;

	public String getBusModel() {
		return busModel;
	}

	public void setBusModel(String busModel) {
		this.busModel = busModel;
	}
}
