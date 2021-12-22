package com.sk11.Customer.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customer")
public class CustomerModel {
    @Id
    private String id;
//    private Long seq;
    private String customerName;
    private String customerPlace;
    private String customerAddress;
    private String customerRating;
    private String time;
    private String addOns;
    private boolean pending;
    private boolean completed;
}
