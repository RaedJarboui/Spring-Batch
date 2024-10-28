package com.spring.badge.config;

import org.springframework.batch.item.ItemProcessor;

import com.spring.badge.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> { // inbound and outbound type customer
																				// (read and write)

	@Override
	public Customer process(Customer customer) throws Exception {
		return customer;
	}
}
