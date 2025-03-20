package com.example.demo.warehouse;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class WareHouseRequestDTO {

    @Size(min=1, max=100)
    private String warehouseName;

    private String locationCode;

    private int capacity;

    private int noOfDoors;

    private int noOfRacks;

    private int managerId;

}
