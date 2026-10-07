/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartest;


public class Car {
    public String plateNumber;
    public String model;
    public double mileage;
    public double fuelLevel;
    public double tankCapacity;

    
    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0.0;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    public void drive(double km) {
        double fuelNeeded = km / 10.0; 
        if (fuelNeeded > fuelLevel) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            System.out.println("Driving " + km + " km...");
            mileage += km;
            fuelLevel -= fuelNeeded;
        }
    }

    public void refuel(double amount) {
        System.out.println("Refueling " + amount + " liters...");
        if (fuelLevel + amount > tankCapacity) {
            fuelLevel = tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        } else {
            fuelLevel += amount;
        }
    }

    
    public void checkStatus() {
        System.out.println("--- Car Status ---");
        System.out.println("Plate: " + plateNumber);
        System.out.println("Model: " + model);
        System.out.println("Current Mileage: " + mileage + " km");
        System.out.println("Fuel Level: " + fuelLevel + " liters / " + tankCapacity + " liters");
        
        
        if (fuelLevel < (tankCapacity * 0.10)) {
            System.out.println("Low fuel warning!");
        }
    }

}

