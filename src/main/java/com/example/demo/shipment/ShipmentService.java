package com.example.demo.shipment;
import com.example.demo.shipment.ShipmentEntity;
import com.example.demo.shipment.ShipmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ShipmentService {

        @Autowired
        private ShipmentRepository shipmentRepository;


    public ShipmentEntity getShipmentById(String shipmentId) {
        return shipmentRepository.findById(shipmentId)
                .orElseThrow(() -> new RuntimeException("Shipment not found with ID: " + shipmentId));
    }



}
