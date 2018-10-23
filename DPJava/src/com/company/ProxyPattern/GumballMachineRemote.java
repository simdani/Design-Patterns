package com.company.ProxyPattern;

import javax.swing.plaf.nimbus.State;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLoacion() throws RemoteException;
    public State getSTate() throws RemoteException;
}
