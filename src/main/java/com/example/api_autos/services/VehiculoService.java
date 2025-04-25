package com.example.api_autos.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.api_autos.models.Vehiculo;
import com.example.api_autos.repository.VehiculoRepository;

@Service
public class VehiculoService {
    
    @Autowired
    private VehiculoRepository repo;
    
    public ArrayList<Vehiculo> obtenerTodos(){
        return repo.obtenerTodos();
    }

    public Vehiculo obtenerUno(String id){
        Vehiculo v = repo.obtenerUno(id);
        if(v == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return v;
    }

    public void eliminar(String id){
        Vehiculo v = obtenerUno(id);
        repo.eliminar(v);
    }
}
 