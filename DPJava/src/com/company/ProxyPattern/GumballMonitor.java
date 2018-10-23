package com.company.ProxyPattern;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball machine: " + machine.getLoacion());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
