package com.example.demo.warehouse;

import java.util.Comparator;

class WareHouseCapacityComparator implements Comparator<WareHouseDTO> {

    @Override
    public int compare(WareHouseDTO w1, WareHouseDTO w2){
        return w1.getCapacity().compareTo(w2.getCapacity());
    }
}
