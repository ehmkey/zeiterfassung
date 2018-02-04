package at.fankhauser.zeiterfassung.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import at.fankhauser.zeiterfassung.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByName(String name);
}
