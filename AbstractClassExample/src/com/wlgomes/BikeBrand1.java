package com.wlgomes;
//Child class which inherits Abstract class
public class BikeBrand1 extends Bike{
    //extending Bike will mean that has to implement run(run is empty in Bike)
    @Override
    void run() {
        System.out.println("Brand 1 bike is running");
    }
}
