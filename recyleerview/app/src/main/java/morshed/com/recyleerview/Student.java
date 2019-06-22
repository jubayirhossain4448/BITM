package morshed.com.recyleerview;

public class Student {
    private String id;
    private String name;
    private String email;
    private String mobileNumber;
    private String dept;

    public Student() {

    }

    public Student(String id, String name, String email, String mobileNumber, String dept) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.dept = dept;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getDept() {
        return dept;
    }
}