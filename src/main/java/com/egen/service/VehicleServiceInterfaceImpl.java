package com.egen.service;

import com.egen.entity.Vehicle;
import com.egen.exception.VehicleNotFoundException;
import com.egen.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class VehicleServiceInterfaceImpl implements VehicleServiceInterface {

     @Autowired
     VehicleRepository vehicleRepository;

     @Override
     public Vehicle createVehicle(Vehicle vehicle) {
          vehicleRepository.save(vehicle);
          return vehicle;
     }

     @Override
     public Vehicle findVehicle(String vin) {
          Optional<Vehicle> byId = vehicleRepository.findById(vin);
          if (byId.isPresent()){
               return byId.get();
          }
          else{
               throw new VehicleNotFoundException("Vehical with vin" + vin +" NOT FOUND");
          }
     }

     @Override
     public void deleteVehicle(String vin) {
          Optional<Vehicle> byId = vehicleRepository.findById(vin);
          if (byId.isPresent()){
               vehicleRepository.delete(byId.get());
          }
          else{
               throw new VehicleNotFoundException("Vehical with vin" + vin +" NOT FOUND");
          }
     }

     @Override
     public List<Vehicle> findAllVehicle() {
          Iterable<Vehicle> all = vehicleRepository.findAll();
          List<Vehicle> vehicleList = StreamSupport.stream(all.spliterator(),false).collect(Collectors.toList());
          return vehicleList;
     }
}
