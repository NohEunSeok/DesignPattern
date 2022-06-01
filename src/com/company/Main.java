package com.company;

import com.company.전략패턴.Duck;
import com.company.전략패턴.FlyRocketPowered;
import com.company.전략패턴.MallardDuck;
import com.company.전략패턴.ModelDuck;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
