package com.example.demo.warehouse;

import org.springframework.http.ResponseEntity;

import java.util.List;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class WareHouseResponse {

    private List<WareHouseDTO> list ;

    private String error;


}
