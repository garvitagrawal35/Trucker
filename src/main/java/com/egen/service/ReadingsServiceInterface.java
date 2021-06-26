package com.egen.service;

import com.egen.entity.Readings;

import java.util.List;

public interface ReadingsServiceInterface {

     public Readings createReading(Readings readings);
     public List<Readings> getAllReadings();
     public Readings getReading(String vin);
     public Readings updateReadings(Readings readings);
     public void deleteReading(String vin);

}
