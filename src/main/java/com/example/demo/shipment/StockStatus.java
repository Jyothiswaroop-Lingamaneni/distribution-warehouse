package com.example.demo.shipment;


public enum StockStatus {
    Stored("Stored"),
    RECEIVED("Received"),
    LOST("Lost"),
    DISPATCHED("Dispatched"),
    DAMAGED("Damaged");

    private final String value;

    // Constructor
    StockStatus(String value) {
        this.value = value;
    }


    // Getter Method
    public String getValue() {
        return value;
    }
}



