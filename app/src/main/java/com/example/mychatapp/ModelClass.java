package com.example.mychatapp;

public class ModelClass {

    //the message itself
    String message;
    // the person who sent the message
    String from;

    public ModelClass() {
    }

    public ModelClass(String message, String from) {
        this.message = message;
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
