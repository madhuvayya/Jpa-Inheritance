package com.hm.hibernateinheritence.joined;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sid")
public class TeachingStaff extends Staff {
	private String qualification;
	private String subjectexpertise;

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubjectexpertise() {
		return subjectexpertise;
	}

	public void setSubjectexpertise(String subjectexpertise) {
		this.subjectexpertise = subjectexpertise;
	}

	@Override
	public String toString() {
		return "TeachingStaff [qualification=" + qualification + ", subjectexpertise=" + subjectexpertise
				+ ", toString()=" + super.toString() + "]";
	}

}
