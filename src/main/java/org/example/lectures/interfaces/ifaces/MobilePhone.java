package org.example.lectures.interfaces.ifaces;


public class MobilePhone implements ComputingDevice, ExternalStorage {

    @Override
    public void compute() {
        System.out.println( "ARM");
    }

    @Override
    public void store() {

        System.out.println("Flash");

    }
}
