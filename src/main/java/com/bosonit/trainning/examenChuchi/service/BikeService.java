package com.bosonit.trainning.examenChuchi.service;

import com.bosonit.trainning.examenChuchi.model.Vehicle;
import com.bosonit.trainning.examenChuchi.registry.AdapterService;
import org.springframework.stereotype.Service;

@Service("bike")
public class BikeService implements AdapterService<Vehicle> {
    @Override
    public void process(Vehicle request) {
        System.out.println("inside bike service - "+request.toString() );
    }
}
