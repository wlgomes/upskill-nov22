package com.wlgomes;
abstract class Bike {
    //constructor
    Bike(){
        System.out.println("Bike created");
    }
    //abstract method - An abstract method has no body when declared in an abstract class. Classes implementing it will provide the implementation
    abstract void run();
    void changeGear(){
        System.out.println("Gear changed");
    }
}
