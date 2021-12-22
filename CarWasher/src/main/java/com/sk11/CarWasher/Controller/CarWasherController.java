package com.sk11.CarWasher.Controller;

import com.sk11.CarWasher.VO.Customer;
import com.sk11.CarWasher.VO.ResponseTemplateVO;
import com.sk11.CarWasher.services.CarWasherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/carwasher")
public class CarWasherController {
    @Autowired
    private CarWasherService carWasherService;
    @GetMapping("/")
    public String home(){
        return "hello";
    }
    @GetMapping("/view/orders")
    public List<Customer> vieworders(){
        return List.of(carWasherService.vieworders());
    }
    @PostMapping("/order/{id}")
    public ResponseEntity<?> AcceptOrRejectOrder(@PathVariable("id" )Long id){
        return  null;
    }
    
}
