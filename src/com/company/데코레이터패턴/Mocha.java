package com.company.데코레이터패턴;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카"; // beverage.description X
    }

    public double cost() {
        return beverage.cost() + .20;
    }
}
