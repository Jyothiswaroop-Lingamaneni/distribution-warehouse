package com.example.demo.warehouse;


import com.example.demo.book.exception.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehouse")
class WareHouseController {

    @Autowired
    private WareHouseService warehouseService;

    @GetMapping("/getwarehouse")
    public ResponseEntity<WareHouseResponse> getAllWarehouses() {
        WareHouseResponse wareHouseResponse = new WareHouseResponse();
        try {
            wareHouseResponse.setList(warehouseService.getAllWarehouses());
            return ResponseEntity.ok(wareHouseResponse);
        } catch (WareHouseException warehouseException) {
            wareHouseResponse.setError(warehouseException.getMessage());
            return ResponseEntity.status(404).body(wareHouseResponse);
        }
    }

    @PostMapping("/createwarehouse")
    public ResponseEntity<String> createWareHouse(@RequestBody WareHouseRequestDTO warehouserequestDTO) {
        warehouseService.createWareHouse(warehouserequestDTO);

        return new ResponseEntity<String>("Success", HttpStatusCode.valueOf(201));

    }

    @PutMapping("/updatewarehouse/{warehouseId}")
    public ResponseEntity<WareHouseEntity> updateWarehouse(
            @PathVariable Integer warehouseId,
            @RequestBody WareHouseEntity updatedWarehouse) {

        try {
            WareHouseEntity warehouse = warehouseService.updateWarehouse(warehouseId, updatedWarehouse);
            return ResponseEntity.ok(warehouse);
        } catch (WareHouseException wareHouseException) {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
    @DeleteMapping("/deletewarehouse/{warehouseId}")
    public ResponseEntity<String> deleteWarehouse(@PathVariable Integer warehouseId) {
        boolean isDeleted = warehouseService.deleteWarehouseById(warehouseId);
        if (isDeleted) {
            return ResponseEntity.ok("Warehouse with ID " + warehouseId + " deleted successfully.");
        } else {
            return ResponseEntity.status(404).body("Warehouse with ID " + warehouseId + " not found.");
        }
    }
}


