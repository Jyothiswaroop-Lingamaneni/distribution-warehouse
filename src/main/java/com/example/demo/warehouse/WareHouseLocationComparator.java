package com.example.demo.warehouse;

import java.util.Comparator;

public class WareHouseLocationComparator implements Comparator<WareHouseDTO> {

    @Override
    public int compare(WareHouseDTO w1, WareHouseDTO w2){
        return w1.getLocationCode().compareTo(w2.getLocationCode());
    }
}
