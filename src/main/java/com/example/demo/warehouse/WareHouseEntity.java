package com.example.demo.warehouse;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="warehouses")
@Getter
@Setter
@NoArgsConstructor
class WareHouseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warehouse_id")
    private Integer warehouseId;

    @Column(name = "warehouse_name", length = 100, nullable = false)
    private String warehouseName;

    @Column(name = "location_code", length = 3, nullable = false)
    private String locationCode; // 3-letter code (e.g., ORD, HKG)

    @Column(name = "capacity", nullable = false)
    private int capacity;

    @Column(name = "no_of_doors", nullable = false)
    private int noOfDoors;

    @Column(name = "no_of_racks", nullable = false)
    private int noOfRacks;

    @Column(name = "manager_id")
    private int managerId;


}
