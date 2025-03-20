package com.example.demo.shipment;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Parameter;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/shipment")
public class ShipmentController {

        @Autowired
        private ShipmentService shipmentService;

    @GetMapping("getshipmentbyid")
    public ShipmentEntity getShipmentById(@RequestParam @Pattern(regexp = "^[A-Za-z]{2}\\d{8}$") @Size(min = 10, max = 10) String shipmentId) {
        return shipmentService.getShipmentById(shipmentId);
    }
}
