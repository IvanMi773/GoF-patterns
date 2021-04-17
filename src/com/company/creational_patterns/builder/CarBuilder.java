package com.company.creational_patterns.builder;

import com.company.creational_patterns.builder.model.Car;

public class CarBuilder implements Builder {

    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        car.setNumberOfSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        car.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(boolean gps) {
        car.setGps(gps);
    }

    public Car getCar() {
        return car;
    }
}
