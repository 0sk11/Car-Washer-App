package com.sk11.CarWasher.repository;

import com.sk11.CarWasher.VO.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerRepo extends MongoRepository<Customer,Long> {

}
