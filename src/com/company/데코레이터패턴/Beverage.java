package com.company.데코레이터패턴;

public abstract class Beverage {
    String description = "음료";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
