package com.company.creational_patterns.builder;

import com.company.creational_patterns.builder.model.Manual;

public class ManualBuilder implements Builder {

    private Manual manual;

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        manual.setNumberOfSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(boolean gps) {
        manual.setGps(gps);
    }

    public Manual getManual() {
        return manual;
    }
}
