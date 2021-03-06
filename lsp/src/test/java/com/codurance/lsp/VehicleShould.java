package com.codurance.lsp;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleShould {
    @Test
    public void start_engine() {
        Vehicle vehicle = new ElectricCar();

        vehicle.startEngine();

        assertThat(vehicle.engineIsStarted())
                .isTrue();

    }

    @Test
    public void stop_engine() {
        Vehicle vehicle = new PetrolCar();

        vehicle.startEngine();
        vehicle.stopEngine();

        assertThat(vehicle.engineIsStarted())
                .isFalse();
    }

    public static class TestableVehicle extends Vehicle {

        @Override
        public void replenish() {

        }

//        @Override
//        public void fillUpWithFuel() {
//
//        }
//
//        @Override
//        public void chargeBattery() {
//
//        }

    }

}