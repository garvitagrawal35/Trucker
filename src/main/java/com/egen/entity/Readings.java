package com.egen.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Readings {

     /*
     {
   "vin": "1HGCR2F3XFA027534",
   "latitude": 41.803194,
   "longitude": -88.144406,
   "timestamp": "2017-05-25T17:31:25.268Z",
   "fuelVolume": 1.5,
   "speed": 85,
   "engineHp": 240,
   "checkEngineLightOn": false,
   "engineCoolantLow": true,
   "cruiseControlOn": true,
   "engineRpm": 6300,
   "tires": {
      "frontLeft": 34,
      "frontRight": 36,
      "rearLeft": 29,
      "rearRight": 34
   }
}
      */

     @Id
     private String vin;
     private int latitude;
     private int longitude;
     private String timestamp;
     private int fuelVolume;
     private int speed;
     private int engineHp;
     private boolean checkEngineLightOn;
     private boolean engineCoolantLow;
     private boolean cruiseControlOn;
     private int engineRpm;

    @Embedded
     private Tires tires;

     public Readings(String vin, int latitude, int longitude, String timestamp, int fuelVolume, int speed, int engineHp, boolean checkEngineLightOn, boolean engineCoolantLow, boolean cruiseControlOn, int engineRpm, Tires tires) {
          this.vin = vin;
          this.latitude = latitude;
          this.longitude = longitude;
          this.timestamp = timestamp;
          this.fuelVolume = fuelVolume;
          this.speed = speed;
          this.engineHp = engineHp;
          this.checkEngineLightOn = checkEngineLightOn;
          this.engineCoolantLow = engineCoolantLow;
          this.cruiseControlOn = cruiseControlOn;
          this.engineRpm = engineRpm;
          this.tires = tires;
     }

     public Readings() {

     }

     public String getVin() {
          return vin;
     }

     public void setVin(String vin) {
          this.vin = vin;
     }

     public int getLatitude() {
          return latitude;
     }

     public void setLatitude(int latitude) {
          this.latitude = latitude;
     }

     public int getLongitude() {
          return longitude;
     }

     public void setLongitude(int longitude) {
          this.longitude = longitude;
     }

     public String getTimestamp() {
          return timestamp;
     }

     public void setTimestamp(String timestamp) {
          this.timestamp = timestamp;
     }

     public int getFuelVolume() {
          return fuelVolume;
     }

     public void setFuelVolume(int fuelVolume) {
          this.fuelVolume = fuelVolume;
     }

     public int getSpeed() {
          return speed;
     }

     public void setSpeed(int speed) {
          this.speed = speed;
     }

     public int getEngineHp() {
          return engineHp;
     }

     public void setEngineHp(int engineHp) {
          this.engineHp = engineHp;
     }

     public boolean isCheckEngineLightOn() {
          return checkEngineLightOn;
     }

     public void setCheckEngineLightOn(boolean checkEngineLightOn) {
          this.checkEngineLightOn = checkEngineLightOn;
     }

     public boolean isEngineCoolantLow() {
          return engineCoolantLow;
     }

     public void setEngineCoolantLow(boolean engineCoolantLow) {
          this.engineCoolantLow = engineCoolantLow;
     }

     public boolean isCruiseControlOn() {
          return cruiseControlOn;
     }

     public void setCruiseControlOn(boolean cruiseControlOn) {
          this.cruiseControlOn = cruiseControlOn;
     }

     public int getEngineRpm() {
          return engineRpm;
     }

     public void setEngineRpm(int engineRpm) {
          this.engineRpm = engineRpm;
     }

     public Tires getTires() {
          return tires;
     }

     public void setTires(Tires tires) {
          this.tires = tires;
     }

     @Override
     public String toString() {
          return "Readings{" +
                  "vin='" + vin + '\'' +
                  ", latitude=" + latitude +
                  ", longitude=" + longitude +
                  ", timestamp='" + timestamp + '\'' +
                  ", fuelVolume=" + fuelVolume +
                  ", speed=" + speed +
                  ", engineHp=" + engineHp +
                  ", checkEngineLightOn=" + checkEngineLightOn +
                  ", engineCoolantLow=" + engineCoolantLow +
                  ", cruiseControlOn=" + cruiseControlOn +
                  ", engineRpm=" + engineRpm +
                  ", tires=" + tires +
                  '}';
     }
}
