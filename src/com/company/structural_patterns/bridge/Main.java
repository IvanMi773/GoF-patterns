package com.company.structural_patterns.bridge;

public class Main {

    public static void main(String[] args) {
        Tv tv = new Tv();
        Remote remote = new Remote(tv);
        remote.channelDown();
    }
}
