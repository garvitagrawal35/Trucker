package com.egen.controller;

import com.egen.entity.Readings;
import com.egen.service.ReadingsServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/readings")
@CrossOrigin(origins = "http://mocker.egen.academy")
public class ReadingsController {

     @Autowired
     ReadingsServiceInterface readingsService;

     @PostMapping
     public Readings createReadings(@RequestBody Readings readings){
          readingsService.createReading(readings);
          return readings;
     }

     @GetMapping
     public List<Readings> getAllReadings(){
          return readingsService.getAllReadings();
     }

     @GetMapping(value = "{vin}")
     public Readings getById(@PathVariable ("vin") String vin){
          return readingsService.getReading(vin);
     }

     @PutMapping
     public Readings updateReading(@RequestBody Readings readings){
          return readingsService.updateReadings(readings);
     }
     
     @DeleteMapping(value = "{vin}")
     public void deleteReading(@PathVariable("vin") String vin){
          readingsService.deleteReading(vin);
     }
}
