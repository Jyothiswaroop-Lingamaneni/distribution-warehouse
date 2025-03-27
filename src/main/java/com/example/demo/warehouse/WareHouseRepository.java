package com.example.demo.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WareHouseRepository extends JpaRepository<WareHouseEntity, Integer> {
    Optional<WareHouseEntity> findByWarehouseId(Integer warehouseId);

}
