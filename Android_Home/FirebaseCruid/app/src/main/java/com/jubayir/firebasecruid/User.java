package com.jubayir.firebasecruid;

public class User {
    private String name;
    private String email;
    private String age;
    private String bloodGroup;

    public User() {
    }

    public User(String name, String email, String age, String bloodGroup) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }
}
