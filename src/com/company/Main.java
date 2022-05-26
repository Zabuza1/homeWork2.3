package com.company;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("BMW", 2);
        Car car = new Car("Audi", 4);
        Truck truck = new Truck("Merc", 8);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(car);
        serviceStation.check(bicycle);
        serviceStation.check(truck);
    }
}
