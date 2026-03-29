package app;

public class Candidate {
    private String registrationNumber;
    private double grade;

    public Candidate(String registrationNumber, double grade) {
        this.registrationNumber = registrationNumber;
        this.grade = grade;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Registration Number: " + registrationNumber + " | Grade: " + grade;
    }
}