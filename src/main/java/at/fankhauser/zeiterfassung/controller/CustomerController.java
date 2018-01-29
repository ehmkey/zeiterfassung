package at.fankhauser.zeiterfassung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import at.fankhauser.zeiterfassung.message.Response;
import at.fankhauser.zeiterfassung.model.Customer;
import at.fankhauser.zeiterfassung.repo.CustomerRepository;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	CustomerRepository repository;

	@RequestMapping(value = "/postcustomer", method = RequestMethod.POST)
	public void postCustomer(@RequestBody Customer customer) {
		repository.save(customer);
	}

	@RequestMapping("/")
	public Response findAll() {

		Iterable<Customer> customers = repository.findAll();

		return new Response("Done", customers);
	}

	@RequestMapping("/{id}")
	public Response findCustomerById(@PathVariable("id") long id) {

		Customer customer = repository.findOne(id);

		return new Response("Done", customer);
	}

	@RequestMapping("/findbylastname")
	public Response findByLastName(@RequestParam("lastName") String lastName) {

		List<Customer> customers = repository.findByName(lastName);

		return new Response("Done", customers);
	}
}
