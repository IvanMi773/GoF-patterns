package com.company.creational_patterns.builder;

public class Director {

    public void construct (Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("test engine");
        builder.setTripComputer("mx-434");
        builder.setGps(true);
    }
}
