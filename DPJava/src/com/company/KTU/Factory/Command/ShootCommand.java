package com.company.KTU.Factory.Command;

import com.company.KTU.Factory.Factory.Enemy;

public class ShootCommand extends ICommand {
    public ShootCommand(Enemy rcv) {
        super(rcv);
    }

    @Override
    public void execute() {
        this.receiver.shoot();
    }

    @Override
    public void undo() {
        System.out.println("Unable to undo.");
    }
}
