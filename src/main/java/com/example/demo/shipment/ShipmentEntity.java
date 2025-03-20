package com.example.demo.shipment;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "internal_shipment_stock")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShipmentEntity  {

    @Id
    @Column(name = "shipment_id", length = 10, nullable = false, unique = true)
    private String shipmentId;

    @Column(name = "tracking_number", length = 50, nullable = false, unique = true)
    private String trackingNumber;

    @Column(name = "warehouse_id", nullable = false)
    private Integer warehouseId;

    @Column(name = "handler_id")
    private Integer handlerId;

    @Enumerated(EnumType.STRING)
    @Column(name = "stock_status", nullable = false)
    private StockStatus stockStatus;

    @Column(name = "item_count", nullable = false)
    private Integer itemCount;

    @Column(name = "shipment_weight", nullable = false, precision = 10, scale = 2)
    private BigDecimal shipmentWeight;

    @Column(name = "shipment_volume", precision = 10, scale = 2)
    private BigDecimal shipmentVolume;

    @Column(name = "fragile")
    private Boolean fragile = false;

    @Column(name = "perishable")
    private Boolean perishable = false;

    @Column(name = "dangerous_goods")
    private Boolean dangerousGoods = false;

    @Column(name = "storage_location", length = 50, nullable = false)
    private String storageLocation;

    @Column(name = "arrival_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime arrivalDate = LocalDateTime.now();

    @Column(name = "dispatch_date")
    private LocalDateTime dispatchDate;

    @Column(name = "last_updated", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private LocalDateTime lastUpdated = LocalDateTime.now();

    @Column(name = "remarks", columnDefinition = "TEXT")
    private String remarks;


}
