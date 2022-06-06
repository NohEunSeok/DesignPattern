package com.company.싱글턴패턴;

public class Singleton {
    private static Singleton uniqueInstance1 = new Singleton();
    private volatile static Singleton uniqueInstance2;
    private volatile static Singleton uniqueInstance3;

    private Singleton(){}

    public static Singleton getInstance1() {
        return uniqueInstance1;
    }

    public static Singleton getInstance2() {
        if(uniqueInstance2 == null) {
            synchronized (Singleton.class) {
                if(uniqueInstance2 == null) {
                    uniqueInstance2 = new Singleton();
                }
            }
        }
        return uniqueInstance2;
    }

    public static synchronized Singleton getInstance3() { // 속도저하 100배
        if(uniqueInstance3 == null) {
            uniqueInstance3 = new Singleton();
        }
        return uniqueInstance3;
    }
}
