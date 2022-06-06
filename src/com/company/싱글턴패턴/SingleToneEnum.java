package com.company.싱글턴패턴;

public enum SingleToneEnum {
    UNIQUE_INSTANCE;

    public void print(){
        System.out.println("print");
    }
}
