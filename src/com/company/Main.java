package com.company;

public class Main {

    public static void main(String[] args) {
        ConcreteChat telegramChat = new ConcreteChat();

        telegramChat.addMessageAdmin("Java developer course");
        telegramChat.addMessageAdmin("Python developer course");

        // write your code here
        User someUser = new User("James");
        telegramChat.addUsers(someUser);

        telegramChat.addMessageAdmin("C# developer course");
        telegramChat.removeMessageAdmin("Python developer course");
    }
}
