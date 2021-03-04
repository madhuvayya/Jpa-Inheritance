package com.hm.hibernateinheritence.table_per_class;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VehicleTest {

	@Autowired
	private VehicleRepository repository;
	
	@Test
	void testSaveBike() {		
		Bike bike = new Bike();
		bike.setVehicleName("Splendor");
		bike.setVehicleType("Two wheeler");
		bike.setBikeModel("2015");
		System.out.println(bike.toString());
		repository.save(bike);
	}
	
	@Test
	void testSaveBus() {
		Bus bus = new Bus();
		bus.setVehicleName("Benz");
		bus.setBusModel("Bharath-benz");
		bus.setVehicleType("Four wheel");
		repository.save(bus);
	}
	
	@Test
	void testSaveVehicle() {
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Truck");
		vehicle.setVehicleType("Transport");
		repository.save(vehicle);
	}
}
