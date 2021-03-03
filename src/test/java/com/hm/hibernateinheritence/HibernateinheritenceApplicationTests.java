package com.hm.hibernateinheritence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hm.hibernateinheritence.entities.Check;
import com.hm.hibernateinheritence.entities.CreditCard;
import com.hm.hibernateinheritence.repos.PaymentRepository;

@SpringBootTest
class HibernateinheritenceApplicationTests {

	@Autowired
	private PaymentRepository repository;

	@Test
	void testSaveCreditCard() {
		CreditCard cc = new CreditCard();
		cc.setId(123);
		cc.setAmount(1000);
		cc.setCardnumber("1234567890");
		repository.save(cc);
	}

	@Test
	void testSaveCheck() {
		Check ch = new Check();
		ch.setId(124);
		ch.setAmount(1500);
		ch.setChecknumber("9876543210");
		repository.save(ch);
	}

}
