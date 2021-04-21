package com.company.behavioral_patterns.strategy;

public class ConcreteStrategySubtract implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
