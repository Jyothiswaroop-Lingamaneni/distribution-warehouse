package com.example.demo.shipment;


public enum StockStatus {
    Stored("Stored"),
    Received("Received"),
    Lost("Lost"),
    Dispatched("Dispatched"),
    Damaged("Damaged");

    private final String value;


    StockStatus(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}



