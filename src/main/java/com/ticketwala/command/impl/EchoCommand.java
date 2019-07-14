package com.ticketwala.command.impl;

import com.ticketwala.command.api.Command;
import com.ticketwala.command.api.Result;

import java.util.List;

public class EchoCommand extends Command {

    public EchoCommand(List<String> args) {
        super(args);
    }

    @Override
    public Result execute() {
        for (String arg:args) {
            System.out.println(arg);
        }
        return new Result(true,"OK");
    }
}
