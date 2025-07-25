package com.btp.appfx.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String userKey;
    private List<BaseEvent> events;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        events = new ArrayList<>();
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<BaseEvent> getEvents() {
        return events;
    }

    public void setEvents(List<BaseEvent> events) {
        this.events = events;
    }
}
