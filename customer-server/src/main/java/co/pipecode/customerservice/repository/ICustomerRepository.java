package co.pipecode.customerservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.pipecode.customerservice.entity.Customer;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findAll();
}
