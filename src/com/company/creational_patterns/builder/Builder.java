package com.company.creational_patterns.builder;

public interface Builder {

    void reset();
    void setSeats(int seats);
    void setEngine(String engine);
    void setTripComputer(String tripComputer);
    void setGps(boolean gps);
}
