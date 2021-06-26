package com.egen.service;

import com.egen.entity.Vehicle;

import java.util.List;

public interface VehicleServiceInterface {
     public Vehicle createVehicle(Vehicle vehicle);
     public Vehicle findVehicle(String vin);
     public void deleteVehicle(String vin);
     public List<Vehicle> findAllVehicle();

}
