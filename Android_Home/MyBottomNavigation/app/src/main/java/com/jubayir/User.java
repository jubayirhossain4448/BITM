package com.jubayir;

public class User {
    private String name;
    private String id;
    private String phoneNo;

    public User(String name, String id, String phoneNo) {
        this.name = name;
        this.id = id;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
