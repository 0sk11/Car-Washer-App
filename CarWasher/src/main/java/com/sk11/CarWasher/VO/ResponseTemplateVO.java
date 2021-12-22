package com.sk11.CarWasher.VO;

import com.sk11.CarWasher.model.WasherModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Customer customer;
    private WasherModel washerModel;
}
