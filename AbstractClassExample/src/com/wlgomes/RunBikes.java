package com.wlgomes;

//Test class which calls abstract and non-abstract methods
abstract class Bike {
    //constructor
    Bike(){
        System.out.println("Bicicleta criada");
    }

    abstract void run(); //abstract method - An abstract method has no body when declared in an abstract class. Classes implementing it will provide the implementation
    void changeGear(){
        System.out.println("Mudar mudança");
    }
}
class MarcaBicicletaX extends Bike{
    //extending Bike will mean that has to implement run(run is empty in Bike)
    @Override
    void run() {
        System.out.println("Bicicleta X em movimento");
    }
}
public class RunBikes {
    public static void main(String[] args) {
        Bike bikeNum1 = new MarcaBicicletaX();
        bikeNum1.run();
        bikeNum1.changeGear();
    }
}
