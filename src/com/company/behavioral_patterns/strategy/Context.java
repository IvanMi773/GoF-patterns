package com.company.behavioral_patterns.strategy;

public class Context {

    private Strategy strategy;

    public Context (Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy (int a, int b) {
        return strategy.execute(a, b);
    }
}
