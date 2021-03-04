package com.hm.hibernateinheritence.single_table;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer>  {

}
