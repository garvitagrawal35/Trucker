package com.egen.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Embeddable
@Entity
public class Tires {
     /*
     tires": {
      "frontLeft": 34,
      "frontRight": 36,
      "rearLeft": 29,
      "rearRight": 34
   }
      */
//     @Id
//     @GeneratedValue(generator = "uuid2")
//     @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
//     private String id;

     private Long id;
     private int frontLeft;
     private int frontRight;
     private int rearLeft;
     private int rearRight;


//     public Tires() {
//          this.id = UUID.randomUUID().toString();
//     }


     public Tires() {
     }

     public Tires(int frontLeft, int frontRight, int rearLeft, int rearRight) {
          this.frontLeft = frontLeft;
          this.frontRight = frontRight;
          this.rearLeft = rearLeft;
          this.rearRight = rearRight;
     }

//     public String getId() {
//          return id;
//     }
//
//     public void setId(String id) {
//          this.id = id;
//     }

     public int getFrontLeft() {
          return frontLeft;
     }

     public void setFrontLeft(int frontLeft) {
          this.frontLeft = frontLeft;
     }

     public int getFrontRight() {
          return frontRight;
     }

     public void setFrontRight(int frontRight) {
          this.frontRight = frontRight;
     }

     public int getRearLeft() {
          return rearLeft;
     }

     public void setRearLeft(int rearLeft) {
          this.rearLeft = rearLeft;
     }

     public int getRearRight() {
          return rearRight;
     }

     public void setRearRight(int rearRight) {
          this.rearRight = rearRight;
     }

     public void setId(Long id) {
          this.id = id;
     }

     @Id
     @GeneratedValue
     public Long getId() {
          return id;
     }

     @Override
     public String toString() {
          return "Tires{" +
                  "frontLeft=" + frontLeft +
                  ", frontRight=" + frontRight +
                  ", rearLeft=" + rearLeft +
                  ", rearRight=" + rearRight +
                  '}';
     }


}
