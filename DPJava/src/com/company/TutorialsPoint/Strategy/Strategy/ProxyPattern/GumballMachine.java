package com.company.TutorialsPoint.Strategy.Strategy.ProxyPattern;

import javax.swing.plaf.nimbus.State;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    String location;

    public GumballMachine(String location) throws RemoteException {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public int getCount() throws RemoteException {
        return 0;
    }

    @Override
    public String getLoacion() throws RemoteException {
        return null;
    }

    @Override
    public State getSTate() throws RemoteException {
        return null;
    }
}
