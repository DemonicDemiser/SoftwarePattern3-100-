package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChat implements Chat{
    private List<String> messages = new ArrayList<>();
    private List<Observer> users = new ArrayList<>();

    public void addMessageAdmin(String message) {
        this.messages.add(message);
        notifyAllUser();
    }

    public void removeMessageAdmin(String message) {
        this.messages.remove(message);
        notifyAllUser();
    }

    @Override
    public void addUsers(Observer users){
        this.users.add(users);
        notifyAllUser();
    }

    @Override
    public void removeUsers(Observer users) {
        this.users.remove(users);
        notifyAllUser();
    }

    @Override
    public void notifyAllUser() {
        for(Observer user: users){
            user.update(this.messages);
        }
    }
}
