package com.jubayir;

public class Student {
    String id;
    String name;
    String roll;
    String fathersName;
    String mothersName;

    public Student() {
    }

    public Student(String id, String name, String roll, String fathersName, String mothersName) {
        this();
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
    }
    
    Student(String id, String name, String roll, String fathersName){
    this.id = id;
    this.name = name;
    this.roll = roll;
    this.fathersName = fathersName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }
    
    
    
}
