package com.company;

public abstract class Vehicle {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    private void updateTyre() {
        System.out.println("Update tyre ");
    }

    public void checkEngine() {
        System.out.println("Service - " + this.modelName);
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre(i + 1);
        }
    }

    private void updateTyre(int i) {
        System.out.println("Update tyre " + i + " from " + wheelsCount);
    }
}
