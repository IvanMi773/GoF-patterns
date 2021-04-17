package com.company.creational_patterns.builder;

import com.company.creational_patterns.builder.model.Car;
import com.company.creational_patterns.builder.model.Manual;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.construct(carBuilder);
        Car car = carBuilder.getCar();

        ManualBuilder manualBuilder = new ManualBuilder();
        director.construct(manualBuilder);
        Manual manual = manualBuilder.getManual();

        System.out.println("Car engine: " + car.getEngine() + " \nManual engine: " + manual.getEngine());
    }
}
