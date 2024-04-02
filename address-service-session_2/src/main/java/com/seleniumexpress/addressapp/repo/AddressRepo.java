package com.seleniumexpress.addressapp.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.seleniumexpress.addressapp.entity.Address;






public interface AddressRepo extends JpaRepository<Address, Integer> {

	// address based on Id

	@Query(nativeQuery = true, value = "select ea.id,ea.lane1,ea.lane2,ea.state,ea.zip from seleniumexpressnew.address ea join seleniumexpressnew.employee e on e.id = ea.employee_id where ea.employee_id =1")
	Address findAddressByEmployeeId(@Param("employeeId") int employeeId);

}
