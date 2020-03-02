package com.georgerosescu.ThymeDB.repo;

import com.georgerosescu.ThymeDB.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {

    List<Customer> findAllByName(String name);

    List<Customer> findAllByEmail(String email);
}
