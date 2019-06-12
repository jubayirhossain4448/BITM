package com.jubayir;

public class OOPExample1 {

    public static void main(String[] args) {
        // String name;

        Person person1 = new Person();
        person1.firstName = "Md.";
        person1.middleName = "Jubayir";
        person1.lastName = "Hossain";
//        person1.age = 27;
//        person1.roll = 243751;
//        person1.mobile = 8282;

        String fullName = person1.getFullName();
        System.out.println(fullName);

//        String number = person1.getNumbers();
//        System.out.println(number);
        Person person2 = person1;
        person2.lastName = "Hasan";
        fullName = person1.lastName;
        System.out.println(fullName);

        person2 = person1;
    }

}
