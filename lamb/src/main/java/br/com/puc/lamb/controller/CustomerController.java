package br.com.puc.lamb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.puc.lamb.model.Customer;
import br.com.puc.lamb.service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public ResponseEntity<?> findAll(@RequestParam(required = false) String query) {
		if (query == null) {
			return ResponseEntity.ok(customerService.findAllCustomers());
		} else {
			return ResponseEntity.ok(customerService.findAllCustomersByStateLike(query));
		}
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> findCustomer(@PathVariable Integer id) {
		Optional<Customer> customerOptional = customerService.findCustomersById(id);
		if (customerOptional.isPresent()) {
			return ResponseEntity.ok(customerOptional.get());
		} else {
			return ResponseEntity.badRequest().build();
		}
	}

}
