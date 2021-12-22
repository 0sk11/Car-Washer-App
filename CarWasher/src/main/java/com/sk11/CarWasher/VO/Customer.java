package com.sk11.CarWasher.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String id;
    private String customerName;
    private String customerPlace;
    private String customerAddress;
    private String customerRating;
    private String time;
    private String addOns;
    private boolean pending;
    private boolean completed;
}
