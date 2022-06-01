package com.company.전략패턴;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
