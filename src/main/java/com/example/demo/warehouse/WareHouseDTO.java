package com.example.demo.warehouse;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class WareHouseDTO {

    private String warehouseName;
    private String locationCode; // 3-letter code (e.g., ORD, HKG)
    private Integer capacity;

    private Integer noOfDoors;

}
