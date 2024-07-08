package com.eurekaClient.eurekaClient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eurekaClient.eurekaClient.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}