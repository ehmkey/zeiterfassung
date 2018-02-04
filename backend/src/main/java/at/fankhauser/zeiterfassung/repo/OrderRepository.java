package at.fankhauser.zeiterfassung.repo;

import org.springframework.data.repository.CrudRepository;

import at.fankhauser.zeiterfassung.model.Orders;

public interface OrderRepository extends CrudRepository<Orders, Long>{
	
}