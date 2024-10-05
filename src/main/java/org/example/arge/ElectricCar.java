package org.example.arge;



public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge ;
    public int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }


    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String drive() {
        return "Electric Car is driving.";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + "ElectricCar is started.";
    }


}
