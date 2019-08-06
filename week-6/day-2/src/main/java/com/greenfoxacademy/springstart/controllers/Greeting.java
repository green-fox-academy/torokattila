package com.greenfoxacademy.springstart.controllers;

public class Greeting {
    long greetCount;
    String content;

    public long getGreetCount() {
        return greetCount;
    }

    public String getContent() {
        return content;
    }

    public Greeting(long id, String content) {
        this.greetCount = id;
        this.content = content;
    }
}
