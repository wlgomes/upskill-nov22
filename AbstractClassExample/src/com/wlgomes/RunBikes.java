package com.wlgomes;

//Test class which calls abstract and non-abstract methods
public class RunBikes {
    public static void main(String[] args) {
        Bike bikeNum1 = new BikeBrand1();
        bikeNum1.run();
        bikeNum1.changeGear();
    }
}
