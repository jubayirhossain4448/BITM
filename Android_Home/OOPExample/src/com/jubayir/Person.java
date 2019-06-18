package com.jubayir;

public class Person {                // Pascale case(First letter of every word would be capital letter)

    String id;
    String name;
    String email;
    String gender;
    String mobileNumber;            // Camel case (First letter of first word would be small letter and then every word's first letter would be capital letter)

    public Person() {
    }

    public Person(String id, String name, String email, String gender, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
    }

}
