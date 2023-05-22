package com.example.demospringrest.models;

public class Bootcamper {
    // Atributos
    private String name;
    private double age;

    // Constructores
    public Bootcamper() {}
    public Bootcamper(String name, double age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setter Methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }

}
