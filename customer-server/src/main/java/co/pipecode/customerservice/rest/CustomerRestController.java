package co.pipecode.customerservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.pipecode.customerservice.entity.Customer;
import co.pipecode.customerservice.service.ICustomerService;

@RestController
@RequestMapping(path = "/api/customers")
public class CustomerRestController {

	@Autowired
	private ICustomerService customerService;

	@PostMapping(path = "/create")
	public Customer create(@RequestBody Customer customer) {
		return customerService.create(customer);
	}

	@GetMapping(path = "/{id}")
	public Customer findOne(@PathVariable("id") long id) {
		return customerService.findById(id);
	}

	@GetMapping(path = "/all")
	public List<Customer> findAll() {
		return customerService.findAll();
	}

	@PutMapping(path = "/update/{id}")
	public Customer update(@PathVariable("id") int id, @RequestBody Customer customer) {
		customer.setId(id);
		return customerService.update(customer);
	}

	@DeleteMapping(path = "/delete/{id}")
	public Customer delete(@PathVariable("id") long id) {
		return customerService.delete(id);
	}

}
