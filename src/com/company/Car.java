package com.company;

public class Car extends Vehicle implements Engine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void check(){
        this.checkEngine();
        this.checkDvigatel();
    }
    public void checkDvigatel(){
        System.out.println("proveryaem dvigatel`");
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + super.getModelName() + '\'' +
                ", wheelsCount=" + super.getWheelsCount() +
                '}';
    }
}
