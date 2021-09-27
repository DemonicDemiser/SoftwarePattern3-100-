package com.company;

import java.util.List;

public class User implements Observer{

    private String user;

    public User(String user){
        this.user = user;
    }

    @Override
    public void update(List<String> message) {
        System.out.println("Dear " + this.user + "," + "\n we have some new courses" + message + "\n");
    }
}
