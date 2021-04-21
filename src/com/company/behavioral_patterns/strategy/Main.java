package com.company.behavioral_patterns.strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Context ct = new Context(new ConcreteStrategyAdd());
        System.out.println(ct.executeStrategy(a, b));

        ct.setStrategy(new ConcreteStrategySubtract());
        System.out.println(ct.executeStrategy(a, b));
    }
}
