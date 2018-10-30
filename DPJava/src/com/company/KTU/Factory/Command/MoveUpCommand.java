package com.company.KTU.Factory.Command;

import com.company.KTU.Factory.Factory.Enemy;

public class MoveUpCommand extends ICommand
{

    public MoveUpCommand(Enemy rcv) {
        super(rcv);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        long x = this.receiver.getPosX();
        long y = this.receiver.getPosY();
        //this.receiver.setPosX(x + 10);
        this.receiver.setPosY(y + 10);
        long nx = this.receiver.getPosX();
        long ny = this.receiver.getPosY();
        System.out.println(this.receiver.getName() + " moving up from (" + x + ", " + y + ") to (" + nx + ", " + ny + ")");
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        long x = this.receiver.getPosX();
        long y = this.receiver.getPosY();
        //this.receiver.setPosX(x + 10);
        this.receiver.setPosY(y - 10);
        long nx = this.receiver.getPosX();
        long ny = this.receiver.getPosY();
        System.out.println(this.receiver.getName() + " moving {undo up} down from (" + x + ", " + y + ") to (" + nx + ", " + ny + ")");
    }

}

