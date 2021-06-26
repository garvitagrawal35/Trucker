package com.egen.controller;

import com.egen.entity.Vehicle;
import com.egen.service.VehicleServiceInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vehicles")
@CrossOrigin(origins = "http://mocker.egen.academy")
public class VehicleController {

     @Autowired
     VehicleServiceInterfaceImpl vehicleService;

     @RequestMapping(method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
     public Vehicle createVehicle(@RequestBody Vehicle vehicle){
      vehicleService.createVehicle(vehicle);
      return vehicle;
     }

     @GetMapping
     public List<Vehicle> findAllVehicle(){
          return vehicleService.findAllVehicle();
     }

     @RequestMapping(method = RequestMethod.GET, value = "{vin}", produces = "application/json")
     public Vehicle findOneVehicle(@PathVariable ("vin") String vin){
          return vehicleService.findVehicle(vin);
     }

     @RequestMapping(method = RequestMethod.DELETE, value = "{vin}")
     public void deleteVehicle(@PathVariable ("vin") String vin){
          vehicleService.deleteVehicle(vin);
     }

     @RequestMapping(method = RequestMethod.PUT)
     public void putVehicle(@RequestBody List<Vehicle> vehicle){
          vehicle.forEach(v -> vehicleService.createVehicle(v));
     }
}
