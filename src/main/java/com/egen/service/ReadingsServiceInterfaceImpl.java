package com.egen.service;

import com.egen.entity.Readings;
import com.egen.entity.Vehicle;
import com.egen.exception.ReadingsNotFoundException;
import com.egen.repository.ReadingsRepository;
import com.egen.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ReadingsServiceInterfaceImpl implements ReadingsServiceInterface{

     @Autowired
     ReadingsRepository readingsRepository;

     @Autowired
     VehicleRepository vehicleRepository;

//     @Autowired
//     TiresRepository tiresRepository;


     @Override
     public Readings createReading(Readings readings) {
          Optional<Vehicle> vehicle = vehicleRepository.findById(readings.getVin());
          if(vehicle.isPresent()){
               //Engine Rpm check
               if(readings.getEngineRpm() > vehicle.get().getRedlineRpm() )
                    System.out.println("Priority: HIGH ------Engine RPm is going higher then red-----");

               //Fuel volume Check
               if(readings.getFuelVolume()< (vehicle.get().getMaxFuelVolume()/10))
                    System.out.println("Priority: Medium ------Fuel is lower then 10%-----");

               //Tire pressure check
               if(readings.getTires().getFrontLeft()<32 || readings.getTires().getFrontLeft()>36){
                    System.out.println("Priority: LOW ---------Please Check your front left Tire--------");
               }else if(readings.getTires().getFrontRight()<32 || readings.getTires().getFrontRight()>36){
                    System.out.println("Priority: LOW ---------Please Check your front right Tire--------");
               }else if(readings.getTires().getRearLeft()<32 || readings.getTires().getRearLeft()>36){
                    System.out.println("Priority: LOW ---------Please Check your rear left Tire--------");
               }else if(readings.getTires().getRearRight()<32 || readings.getTires().getRearRight()>36){
                    System.out.println("Priority: LOW ---------Please Check your rear right Tire--------");
               }

               //Engine check
               if(readings.isEngineCoolantLow() || readings.isCheckEngineLightOn())
                    System.out.println("Priority: LOW ---------Check your Engine---------");
                    return readingsRepository.save(readings);
          }else{
               throw new ReadingsNotFoundException("Vehicle with vin" + readings.getVin() +" NOT FOUND");
          }

     }

     @Override
     public List<Readings> getAllReadings() {
          Iterable<Readings> all = readingsRepository.findAll();
          return StreamSupport.stream(all.spliterator(),false).collect(Collectors.toList());
     }

     @Override
     public Readings getReading(String vin) {
          Optional<Readings> byId = readingsRepository.findById(vin);
          if(byId.isPresent()){
               return byId.get();
          }else{
               throw new ReadingsNotFoundException("Readings with vin" + vin +" NOT FOUND");
          }
     }

     @Override
     public Readings updateReadings(Readings readings) {
          return readingsRepository.save(readings);
     }

     @Override
     public void deleteReading(String vin) {
          readingsRepository.deleteById(vin);
     }
}
