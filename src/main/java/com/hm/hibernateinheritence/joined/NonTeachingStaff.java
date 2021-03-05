package com.hm.hibernateinheritence.joined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")
public class NonTeachingStaff extends Staff {
	private String areaexpertise;

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}

	@Override
	public String toString() {
		return "NonTeachingStaff [areaexpertise=" + areaexpertise + ", toString()=" + super.toString() + "]";
	}

}
