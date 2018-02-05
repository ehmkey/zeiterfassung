package at.fankhauser.zeiterfassung.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import at.fankhauser.zeiterfassung.message.Response;
import at.fankhauser.zeiterfassung.model.WorkedOrder;
import at.fankhauser.zeiterfassung.repo.WorkedOrderRepository;

/**
 * Rest Controller for working data
 * @author Markus Kienleitner
 *
 */
@RestController
@RequestMapping(value = "/api/worked")
public class WorkedApi {
	private static final Logger LOG = LoggerFactory.getLogger(WorkedApi.class);

	@Autowired
	WorkedOrderRepository repository;

	/**
	 * Find all Orders
	 * 
	 * @return
	 */
	@RequestMapping
	public Response findAll() {

		Iterable<WorkedOrder> customers = repository.findAll();

		return new Response("Done", customers);
	}

	/**
	 * Save worked hours per employee and order
	 * 
	 * @param customer
	 */
	@RequestMapping(method = RequestMethod.POST)
	public Response postCustomer(@RequestBody WorkedOrder workedPerOrder) {
		if (workedPerOrder == null) {
			LOG.error("Working data is null");
			throw new NoWorkingDataException();
		}

		repository.save(workedPerOrder);
		return new Response("Saved");
	}

	@RequestMapping("/search")
	public Response findByFilter() {
		return new Response("", new WorkedOrder());
	}

	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "No working data given")
	public class NoWorkingDataException extends RuntimeException {
	}

}
