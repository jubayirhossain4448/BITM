package com.jubayir;

public class Person {

    public String firstName;
    public String middleName;
    public String lastName;
    
    public int age;
    public int roll;
    public int mobile;

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String getNumbers(){
    return age + " " + roll + " " + mobile;
    }
}
