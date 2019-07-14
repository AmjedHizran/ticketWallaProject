package com.ticketwala.command.api;

import com.ticketwala.command.impl.EchoCommand;
import com.ticketwala.command.impl.IllegalCommand;

import java.util.Arrays;
import java.util.List;

public class CommandFactory {

    public Command createCommand(String arguments) {
        Command result = null;
        List<String> commandList = Arrays.asList(arguments.split("\\s+"));
        if(!(commandList.get(0).equals("Bye") || commandList.get(0).equals("bye"))) {

            switch (commandList.get(0)) {
                case "echo":
                    result =  new EchoCommand(commandList.subList(1,commandList.size()));
                    break;
                default:
                    result =  new IllegalCommand(commandList.subList(1,commandList.size()));
                    break;
            }
        }
        return result;
    }

}
