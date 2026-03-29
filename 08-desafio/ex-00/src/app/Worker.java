package app;

public class Worker {
    // Attributes of the Worker class.
    private final String name;
    private final String telephone;
    private final String email;
    private final String cpf;

    // Constructor used to create a new worker object.
    public Worker(String name, String telephone, String email, String cpf) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.cpf = cpf;
    }

    // Getter used to access the CPF from outside the class.
    public String getCpf() {
        return cpf;
    }

    // Returns a formatted string representation of the worker object.
    @Override
    public String toString() {
        return "Name: " + name +
               ", Telephone: " + telephone +
               ", Email: " + email +
               ", CPF: " + cpf;
    }
}