package com.runtime;

//runtime
class Computer{
    String run(){return "Computador ligado";
    }  }
class Laptop extends Computer {
    @Override
    String run() {
        return "Portátil ligado";
    }
}
public class Main{
    public static void main(String[] args){
        Computer  c = new  Laptop(); //upcasting
        System.out.println(c.run());
    }
}
