package com.example.demo.domain;

//import sun.jvm.hotspot.gc.shared.Generation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//lets springboot know that customer classes are an entity stored in database. Also indicates that customer is JPA entity. assumed eneity will be mapped to a table named customer
@Entity
public class CarInfo {
    //id's and sort last name and first name


    public CarInfo(String carMake, String carModel) {
        this.carMake = carMake;
        this.carModel = carModel;
    }

    //defining classes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //indicates that the id should be generated automatically
    private Long id;
    private String carMake;
    private String carModel;
    private String use, a, comma;

    private CarInfo() {
        //@Entity needs a no argument constructor
    }


    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "id=" + id +
                ", firstName='" + carMake + '\'' +
                ", lastName='" + carModel + '\'' +
                '}';
    }
}
