package com.sk11.Customer.controller;

import com.sk11.Customer.model.CustomerModel;
import com.sk11.Customer.service.CustomerService;
import lombok.extern.flogger.Flogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/user")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/")
    public ResponseEntity<?>home(){
        return new ResponseEntity<>("Hello",HttpStatus.OK);
    }

    @PostMapping("/order")
    public ResponseEntity<?> addCustomer(@RequestBody CustomerModel customer){
        try{
            customerService.save(customer);
            return new ResponseEntity<>("Added", HttpStatus.OK);
        }catch (Exception e){
            //add Logger method
             return  new ResponseEntity<>("Order could not be placed : ",HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/view/all")
    public ResponseEntity<?> viewAllOrders(){
        List<CustomerModel> listOfOrders = customerService.findAll();
        if(listOfOrders!=null){
            return new ResponseEntity<>(listOfOrders,HttpStatus.OK);
        }
        return new ResponseEntity<>("No Orders Found",HttpStatus.NOT_FOUND);
    }
//    @GetMapping("/order/receipt/{id}")
//    public ResponseEntity<?> viewReciept(@PathVariable("id") Long id){
//        return new ResponseEntity<>(customerService.generateReceipt(id),HttpStatus.OK);
//    }

   @GetMapping("/profile/view/{id}")
    public ResponseEntity<?> viewProfile(@PathVariable("id") String id){
        return null;
   }
}
