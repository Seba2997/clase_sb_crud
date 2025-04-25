package com.example.api_autos.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Vehiculo {

    private String id;
    private String marca;
    private String modelo;
    private int precio;
    
    
}