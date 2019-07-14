package com.ticketwala.command.api;

import java.util.List;

public abstract class Command {

    protected List<String> args;

    public Command(List<String> args) {
        this.args = args;
    }

    public abstract Result execute();

}
