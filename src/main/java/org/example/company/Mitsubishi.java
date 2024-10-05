package org.example.company;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return getName() + " is breaking!";
    }

    @Override
    public String accelerate() {
        return getName() + " is accelerating";
    }

    @Override
    public String startEngine() {
       return getName() + " is starting!";
    }
}
