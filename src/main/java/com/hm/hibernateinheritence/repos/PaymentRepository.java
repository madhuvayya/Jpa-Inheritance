package com.hm.hibernateinheritence.repos;

import org.springframework.data.repository.CrudRepository;

import com.hm.hibernateinheritence.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer>  {

}
