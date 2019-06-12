package com.jubayir;

public class OOPExample1 {

    public static void main(String[] args) {
        // String name;

        Person person1 = new Person();
        person1.firstName = "Md.";
        person1.middleName = "Jubayir";
        person1.lastName = "Hossain";

        String fullName = person1.getFullName();
        System.out.println(fullName);
    }

}
