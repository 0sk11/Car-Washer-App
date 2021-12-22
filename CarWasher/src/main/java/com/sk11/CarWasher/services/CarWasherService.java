package com.sk11.CarWasher.services;

import com.sk11.CarWasher.VO.Customer;
import com.sk11.CarWasher.VO.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class CarWasherService {
    @Autowired
    private RestTemplate restTemplate;


    public Customer[] vieworders() {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        ResponseEntity<Customer[]> responseEntity = restTemplate.getForEntity("http://CUSTOMER-SERVICE/user/view/all",Customer[].class);
        Customer[] customer = responseEntity.getBody();

        return customer;
    }
}
