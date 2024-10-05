package org.example.arge;

public class ArgeMain {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("Tesla" , "Tesla" , 200, 4000);
        CarSkeleton hybridCar = new HybridCar("Honda" , "Honda desc" , 40 , 2000,4);
        CarSkeleton gasPowCar = new GasPoweredCar("Toyota" , "Toyota 4" , 34 , 3);

        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPowCar);

    }

    public static void startEngine(CarSkeleton cs) {
        System.out.println(cs.startEngine());
    }
}
