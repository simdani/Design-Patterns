package com.company.KTU.Factory.Command;

import java.util.LinkedList;

public class Invoker {
    private LinkedList<ICommand> commands = new LinkedList<>();

    public void run(ICommand cmd) {
        cmd.execute();
        commands.add(cmd);
    }

    public void undo() {
        commands.getLast().undo();
        commands.removeLast();
    }
}
