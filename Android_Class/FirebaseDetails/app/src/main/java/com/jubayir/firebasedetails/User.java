package com.jubayir.firebasedetails;

public class User {
    private String name;
    private String bClass;
    private String sec;
    private String roll;

    public User() {
    }

    public User(String name, String bClass, String sec, String roll) {
        this.name = name;
        this.bClass = bClass;
        this.sec = sec;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public String getbClass() {
        return bClass;
    }

    public String getSec() {
        return sec;
    }

    public String getRoll() {
        return roll;
    }
}
