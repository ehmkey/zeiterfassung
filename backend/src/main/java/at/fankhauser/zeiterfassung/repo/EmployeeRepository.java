package at.fankhauser.zeiterfassung.repo;


import org.springframework.data.repository.CrudRepository;

import at.fankhauser.zeiterfassung.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
