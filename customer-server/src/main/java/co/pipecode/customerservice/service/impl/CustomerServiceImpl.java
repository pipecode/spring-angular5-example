package co.pipecode.customerservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.pipecode.customerservice.entity.Customer;
import co.pipecode.customerservice.repository.ICustomerRepository;
import co.pipecode.customerservice.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository customerRepository;

	@Override
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		Customer existe = findById(customer.getId());
		if (existe != null) {
			customerRepository.save(customer);
		}
		return customer;
	}

	@Override
	public Customer delete(Long id) {
		Customer customer = findById(id);
		if (customer != null) {
			customerRepository.delete(customer);
		}
		return customer;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(Long id) {
		return customerRepository.findById(id).get();
	}

}
