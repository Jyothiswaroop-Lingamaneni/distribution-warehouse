package com.example.demo.shipment;


public enum StockStatus {
    Stored("Stored"),
    Received("Received"),
    Lost("Lost"),
    Dispatched("Dispatched"),
    Damaged("Damaged");

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



