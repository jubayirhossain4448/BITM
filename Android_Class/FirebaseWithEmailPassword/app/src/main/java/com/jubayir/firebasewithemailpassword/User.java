package com.jubayir.firebasewithemailpassword;

public class User {
    String name, email, age, bloodGroup;

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
