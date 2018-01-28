package at.fankhauser.zeiterfassung.repo;

import org.springframework.data.repository.CrudRepository;

import at.fankhauser.zeiterfassung.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{
	
}