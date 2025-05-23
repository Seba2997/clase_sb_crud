package com.example.api_autos.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_autos.models.Vehiculo;
import com.example.api_autos.services.VehiculoService;

@RestController
@RequestMapping("vehiculo")
public class VehiculoController {
    
    @Autowired
    private VehiculoService sVehiculo;

    @GetMapping("")
    public ArrayList<Vehiculo> todos(){
        return sVehiculo.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Vehiculo obtenerUno(@PathVariable String id){
        return sVehiculo.obtenerUno(id);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable String id){
        sVehiculo.eliminar(id);
        return "Eliminado!";
    }

}
