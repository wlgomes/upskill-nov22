package com.compile;

class Computer {
    String run() {
        return "Computador ligado";
    }
    void run(String value) {
        System.out.println("Computador ligado, tipo:" + value);
    }
}
public class Main {
    public static void main(String args[]) {
        Computer c = new Computer();
        c.run();
        c.run("Portátil");
    }
}