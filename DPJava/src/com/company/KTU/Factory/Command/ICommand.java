package com.company.KTU.Factory.Command;

import com.company.KTU.Factory.Factory.Enemy;

public abstract class ICommand {
    protected Enemy receiver = null;

    public ICommand(Enemy rcv) {
        this.setReceiver(rcv);
    }

    public abstract void execute();

    public abstract void undo();

    public Enemy getReceiver() {
        return receiver;
    }

    public void setReceiver(Enemy receiver) {
        this.receiver = receiver;
    }
}
