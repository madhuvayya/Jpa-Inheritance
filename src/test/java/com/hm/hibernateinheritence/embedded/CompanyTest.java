package com.hm.hibernateinheritence.embedded;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompanyTest {

	@Autowired
	private CompanyRepository repository;
	
	@Test
	void testSaveCompany() {
		Company company = new Company();
		company.setName("Amazon");
		Address address = new Address();
		address.setStreetAddress("Abc street");
		address.setCity("Los angels");
		address.setCountry("USA");
		address.setState("New york");
		address.setZipcode("123456");
		company.setAddress(address);
		repository.save(company);
	}
}
