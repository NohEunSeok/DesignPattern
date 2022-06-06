package com.company;

import com.company.싱글턴패턴.ChocolateBoiler;
import com.company.싱글턴패턴.SingleToneEnum;
import com.company.전략패턴.Duck;
import com.company.전략패턴.FlyRocketPowered;
import com.company.전략패턴.MallardDuck;
import com.company.전략패턴.ModelDuck;

public class Main {

    public static void main(String[] args) {
        SingleToneEnum singleToneEnum = SingleToneEnum.UNIQUE_INSTANCE;
        singleToneEnum.print();
    }
}
