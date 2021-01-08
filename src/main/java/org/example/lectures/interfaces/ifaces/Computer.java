package org.example.lectures.interfaces.ifaces;

public abstract class Computer implements ExternalStorage, ExternalVideo, ComputingDevice {


    @Override
    public void store() {
        System.out.println("Store to SSD");

    }

    @Override
    public void compute() {
        System.out.println("x86");

    }
}
