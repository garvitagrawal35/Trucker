package com.egen.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {

     /*
     {
    "vin": "1HGCR2F3XFA027534",
    "make": "HONDA",
    "model": "ACCORD",
    "year": 2015,
    "redlineRpm": 5500,
    "maxFuelVolume": 15,
    "lastServiceDate": "2017-05-25T17:31:25.268Z"
 },
      */

     @Id
     private String vin;

     private String make;
     private String model;
     private int year;
     private  int redlineRpm;
     private int maxFuelVolume;
     private String lastServiceDate;

     public Vehicle(String vin, String make, String model, int year, int redlineRpm, int maxFuelVolume, String lastServiceDate) {
          this.vin = vin;
          this.make = make;
          this.model = model;
          this.year = year;
          this.redlineRpm = redlineRpm;
          this.maxFuelVolume = maxFuelVolume;
          this.lastServiceDate = lastServiceDate;
     }

     public Vehicle() {

     }

     public String getVin() {
          return vin;
     }

     public void setVin(String vin) {
          this.vin = vin;
     }

     public String getMake() {
          return make;
     }

     public void setMake(String make) {
          this.make = make;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public int getYear() {
          return year;
     }

     public void setYear(int year) {
          this.year = year;
     }

     public int getRedlineRpm() {
          return redlineRpm;
     }

     public void setRedlineRpm(int redlineRpm) {
          this.redlineRpm = redlineRpm;
     }

     public int getMaxFuelVolume() {
          return maxFuelVolume;
     }

     public void setMaxFuelVolume(int maxFuelVolume) {
          this.maxFuelVolume = maxFuelVolume;
     }

     public String getLastServiceDate() {
          return lastServiceDate;
     }

     public void setLastServiceDate(String lastServiceDate) {
          this.lastServiceDate = lastServiceDate;
     }

     @Override
     public String toString() {
          return "Vehical{" +
                  "vin='" + vin + '\'' +
                  ", make='" + make + '\'' +
                  ", model='" + model + '\'' +
                  ", year=" + year +
                  ", redlineRpm=" + redlineRpm +
                  ", maxFuelVolume=" + maxFuelVolume +
                  ", lastServiceDate='" + lastServiceDate + '\'' +
                  '}';
     }
}
