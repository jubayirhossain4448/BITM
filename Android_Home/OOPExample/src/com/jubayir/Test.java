package com.jubayir;

public class Test {

    public static void main(String[] args) {
        Person person = new Person();           // Object create korar time e or Object create korte hole Constructor create korte hoi
        person.id = "Round-37";
        person.name = "Md. Jubayir Hossain";
        person.email = "jubayirhossain4448@gmail.com";
        person.gender = "Male";
        person.mobileNumber = "01918718282";
        System.out.println("The result of Object is : " + " " + person.id + " " + person.name + " " + person.email + " " + person.gender + " " + person.mobileNumber);
    }

}
