package com.example.car.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String brand;

    private String model;

    private String color;

    private String registerNumber;

    private int year;

    private int price;

    @Column(name = "explanation", nullable = false, length = 512)
    private String description;

    public Car(){}

//    public Car(String brand, String model, String color, String registerNumber, int year, int price, Owner owner){
//
//        super();
//        this.brand = brand;
//        this.model = model;
//        this.color = color;
//        this.registerNumber = registerNumber;
//        this.year = year;
//        this.price = price;
//        this.owner = owner;
//    }

    public Car(String brand, String model, String color, String registerNumber, int year, int price, String description){

        super();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.year = year;
        this.price = price;
        this.description = description;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner")
    private Owner owner;

    public Owner getOwner(){
        return owner;
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }

//    @ManyToMany(mappedBy = "cars")
//    private Set<Owner> owners = new HashSet<Owner>();
//
//    public Set<Owner> getOwners(){
//        return owners;
//    }
//
//    public void setOwners(Set<Owner> owners){
//        this.owners = owners;
//    }
}
