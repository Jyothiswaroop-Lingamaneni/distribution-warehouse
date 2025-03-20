package com.example.demo.shipment;


public enum StockStatus {
    Stored("Stored"),
    Received("Received"),
    Lost("Lost"),
    Dispatched("Dispatched"),
    Damaged("Daaged");

    private final String value;


    StockStatus(String value) {
        this.value = value;
    }


    // Getter Method
    public String getValue() {
        return value;
    }
}



