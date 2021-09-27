package com.company;

public interface Chat {
    void addUsers(Observer users);
    void removeUsers(Observer users);
    void notifyAllUser();
}
