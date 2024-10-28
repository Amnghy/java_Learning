package com.atguigu06.team.service;

public class TeamException extends Exception{
    static final long serialVersionUID = -33875211321329948L;
    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
