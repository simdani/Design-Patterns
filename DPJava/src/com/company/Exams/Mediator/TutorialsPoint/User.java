package com.company.Exams.Mediator.TutorialsPoint;

public class User {
    private String name;

    public User(String message) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
