package com.example.demo.warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
class WareHouseService {
    @Autowired
    private WareHouseRepository warehouseRepository;

    public List<WareHouseDTO> getAllWarehouses() throws WareHouseException{

        List<WareHouseEntity> entities= warehouseRepository.findAll();
        return entities.stream().map(this::mapToWarehouseDTO)
                .sorted(Comparator.comparing(WareHouseDTO::getLocationCode).thenComparing(WareHouseDTO::getCapacity)).collect(Collectors.toList());


    }

    public WareHouseDTO mapToWarehouseDTO(WareHouseEntity wareHouseEntity){
        WareHouseDTO dto = new WareHouseDTO();
        dto.setCapacity(wareHouseEntity.getCapacity());
        dto.setWarehouseName(wareHouseEntity.getWarehouseName());
        dto.setLocationCode(wareHouseEntity.getLocationCode());
        dto.setNoOfDoors(wareHouseEntity.getNoOfDoors());

        return dto;

    }

    public WareHouseEntity createWareHouse(WareHouseRequestDTO warehouserequestDTO){

        WareHouseEntity w= new WareHouseEntity();
        w.setWarehouseName(warehouserequestDTO.getWarehouseName());
        w.setCapacity(warehouserequestDTO.getCapacity());
        w.setLocationCode(warehouserequestDTO.getLocationCode());
        w.setNoOfDoors(warehouserequestDTO.getNoOfDoors());
        w.setNoOfRacks(warehouserequestDTO.getNoOfRacks());
        w.setManagerId(warehouserequestDTO.getManagerId());

        return warehouseRepository.save(w);



    }
    }
