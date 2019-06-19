package morshed.com.recyclerview;

public class Student {
    private String id;
    private String name;
    private String email;
    private String mobileNumber;

    public Student() {
    }

    public Student(String id, String name, String email, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
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
}
