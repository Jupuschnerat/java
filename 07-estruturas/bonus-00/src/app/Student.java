package app;

public class Student {
    private String name;
    private String telephone;
    private String email;

    public Student(String name, String telephone, String email) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               ", Telephone: " + telephone +
               ", Email: " + email;
    }
}