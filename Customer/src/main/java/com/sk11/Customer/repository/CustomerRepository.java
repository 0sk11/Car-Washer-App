package com.sk11.Customer.repository;

import com.sk11.Customer.model.CustomerModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepository extends MongoRepository<CustomerModel,String> {
    @Query("{'pending' : ?true}")
    List<CustomerModel> findPending();

    @Query("{'completed' : ?true}")
    List<CustomerModel> findCompleted();

    @Query("{'review' : ?0}")
    void findReview();
}
