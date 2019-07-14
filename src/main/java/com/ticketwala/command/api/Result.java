package com.ticketwala.command.api;

public class Result {
    private boolean status;
    private String msg;

    public Result(boolean status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public boolean getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }
}
