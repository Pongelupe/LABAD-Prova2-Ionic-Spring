package br.com.puc.lamb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.puc.lamb.model.Customer;
import br.com.puc.lamb.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}

	public Optional<Customer> findCustomersById(int id) {
		return customerRepository.findById(id);
	}

	public List<Customer> findAllCustomersByStateLike(String state) {
		return customerRepository.findAllByStateLike(state);
	}

}
