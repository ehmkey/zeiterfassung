package at.fankhauser.zeiterfassung.repo;

import org.springframework.data.repository.CrudRepository;

import at.fankhauser.zeiterfassung.model.WorkedOrder;

public interface WorkedOrderRepository extends CrudRepository<WorkedOrder, Long>{

}
