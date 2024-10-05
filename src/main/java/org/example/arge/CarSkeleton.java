package org.example.arge;

import org.example.company.Car;

public class CarSkeleton {

    private String description;
    private String name;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.description = description;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String startEngine (){
        System.out.println("Class Name : " + this.getClass().getName());
        return getName() + "Engine is starting...";
    }

    public String drive (){
        runEngine(this);
        return getName() + " is driving...";
    }

    public void runEngine(CarSkeleton cs) {

        if(cs instanceof ElectricCar) {
           double avgKmPerCharge = ((ElectricCar) cs).getAvgKmPerCharge();
           int batterySize = ((ElectricCar) cs).getBatterySize();
            System.out.println("Engine is running with electric. Per charge : " + avgKmPerCharge + " battery size : " + batterySize);

        } else if(cs instanceof HybridCar) {
            HybridCar hybridCar = (HybridCar) cs;
            System.out.println("Car engine starts with hybrid " +
                                    "Per charge: " + hybridCar.getAvgKmPerLiter() + " battery size : " + hybridCar.getBatterySize()
                                        + " cylinders : " + hybridCar.getCylinders());

        } else if (cs instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar;
            gasPoweredCar = (GasPoweredCar) cs;
            System.out.println("Gas powered car average consumption : " + gasPoweredCar.getAverageKmPerLiter());

        } else {
            System.out.println("Invalid Car Type");
        }
    }
}
