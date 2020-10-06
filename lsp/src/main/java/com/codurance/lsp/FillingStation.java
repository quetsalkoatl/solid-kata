package com.codurance.lsp;

public class FillingStation {

    public void replenish(Vehicle vehicle) {
        vehicle.replenish();
    }

    public void refuel(Vehicle vehicle) {
        replenish(vehicle);
//        if (vehicle instanceof PetrolCar) {
//            vehicle.fillUpWithFuel();
//        }
    }

    public void charge(Vehicle vehicle) {
        replenish(vehicle);
//        if (vehicle instanceof ElectricCar) {
//            vehicle.chargeBattery();
//        }
    }
}
