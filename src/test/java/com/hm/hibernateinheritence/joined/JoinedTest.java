package com.hm.hibernateinheritence.joined;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JoinedTest {

	@Autowired
	private StaffRepository staffRepository;
	
	@Test
	void testSaveTechingStaff() {
		TeachingStaff teachingStaff = new TeachingStaff();
		teachingStaff.setSname("Gopal");
		teachingStaff.setQualification("MSc MEd");
		teachingStaff.setSubjectexpertise("Maths");
		staffRepository.save(teachingStaff);
	}

	@Test
	void testSaveNonTechingStaff() {
		NonTeachingStaff nts = new NonTeachingStaff();
		nts.setSname("Satish");
		nts.setAreaexpertise("Accounts");
		staffRepository.save(nts);
	}
	
	@Test
	void testFindAll() {
		Iterable<Staff> staff = staffRepository.findAll();
		staff.forEach(e-> System.out.println(e.toString()));
	}
}
