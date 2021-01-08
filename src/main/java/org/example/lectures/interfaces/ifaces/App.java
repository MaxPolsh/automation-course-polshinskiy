package org.example.lectures.interfaces.ifaces;

public class App {

    public static  void main (String[] args){

        ComputingDevice laptop = new Laptop();
        laptop.compute();

        ExternalStorage desktop = new Desktop();
        desktop.store();

        ComputingDevice phone = new MobilePhone();
        phone.compute();

    }
}
