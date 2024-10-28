package com.spring.badge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.badge.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
