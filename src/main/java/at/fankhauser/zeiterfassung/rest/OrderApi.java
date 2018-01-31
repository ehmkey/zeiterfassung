package at.fankhauser.zeiterfassung.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.fankhauser.zeiterfassung.message.Response;
import at.fankhauser.zeiterfassung.model.Orders;
import at.fankhauser.zeiterfassung.repo.OrderRepository;

@RestController
@RequestMapping(value = "/order")
public class OrderApi {

	private static final Logger LOG = LoggerFactory.getLogger(OrderApi.class);

	@Autowired
	private OrderRepository repo;

	@RequestMapping
	public Response findAll() {
		Iterable<Orders> orders = repo.findAll();

		LOG.debug("Orders gesucht...");

		return new Response("Done", orders);
	}
}
