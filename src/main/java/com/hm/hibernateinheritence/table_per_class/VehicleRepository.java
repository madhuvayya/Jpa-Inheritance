package com.hm.hibernateinheritence.table_per_class;

import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

}
