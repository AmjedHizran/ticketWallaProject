package com.ticketwala.command.impl;

import com.ticketwala.command.api.Command;
import com.ticketwala.command.api.Result;

import java.util.List;

public class IllegalCommand extends Command {
    public IllegalCommand(List<String> args) {
        super(args);
    }

    @Override
    public Result execute() {
        return new Result(false,"Invalid Command");
    }
}
