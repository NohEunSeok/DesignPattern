package com.company.데코레이터패턴;
 
public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑크림";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
