package com.company;

public class Bicycle extends Vehicle implements Engine {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        this.checkEngine();
    }

    public String toString() {
        return "Bicycle{" +
                "modelName='" + super.getModelName() + '\'' +
                ", wheelsCount=" + super.getWheelsCount() +
                '}';
    }
}
