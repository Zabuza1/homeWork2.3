package com.company;

public class Truck extends Vehicle implements Engine {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void check(){
     this.checkEngine();
     this.checkTruckDvigatel();
     this.checkPricep();
    }
    public void checkTruckDvigatel(){
        System.out.println("truck dvigatel");
    }
    public void checkPricep(){
        System.out.println("check pricep for truck ");
    }
    public String toString() {
        return "Truck{" +
                "modelName='" + super.getModelName() + '\'' +
                ", wheelsCount=" + super.getWheelsCount() +
                '}';
    }
}
