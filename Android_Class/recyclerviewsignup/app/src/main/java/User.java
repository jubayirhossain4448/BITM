public class User {
    private String name;
    private String email;
    private int age;
    private String bloodgroup;

    public User(String name, String email, int age, String bloodgroup) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.bloodgroup = bloodgroup;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }
}
