package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = Boolean.TRUE;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    private void logName() {
        System.out.println("Class Name: " + getClass().getSimpleName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

    public String startEngine(){
        logName();
        return "the car's engine is starting" ;

    }

    public String accelerate(){
        logName();
        return "the car is accelerating";
    }

    public String brake(){
        logName();
        return "the car is braking";
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
