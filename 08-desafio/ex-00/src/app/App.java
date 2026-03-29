package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // List that stores all workers in memory
        List<Worker> workers = new ArrayList<>();

        // Scanner used to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Variable to store the menu option chosen by the user
        int option;

        // Main loop of the program (runs until user chooses to exit)
        do {
            // Display menu options
            System.out.println("\n=== WORKER MANAGEMENT SYSTEM ===");
            System.out.println("1 - Add a worker");
            System.out.println("2 - Show all workers");
            System.out.println("3 - Remove a worker by CPF");
            System.out.println("4 - Exit");
            System.out.print("Choose an option: ");

            // Read the option as integer
            option = scanner.nextInt();

            // VERY IMPORTANT: consume the line break after nextInt()
            scanner.nextLine();

            // Decide what to do based on the option
            switch (option) {

                case 1:
                    // Add a new worker
                    addWorker(workers, scanner);
                    break;

                case 2:
                    // Show all workers
                    showWorkers(workers);
                    break;

                case 3:
                    // Remove worker AND show updated list
                    removeWorker(workers, scanner);
                    break;

                case 4:
                    // Exit program
                    System.out.println("Exiting the program...");
                    break;

                default:
                    // Invalid option handling
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            }

        } while (option != 4);

        // Close scanner at the end
        scanner.close();
    }

    // Method responsible for adding a new worker
    public static void addWorker(List<Worker> workers, Scanner scanner) {

        // Ask for worker's data
        System.out.print("Enter worker's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter worker's telephone number: ");
        String telephone = scanner.nextLine();

        System.out.print("Enter worker's email: ");
        String email = scanner.nextLine();

        System.out.print("Enter worker's CPF: ");
        String cpf = scanner.nextLine();

        // Check if CPF already exists
        for (Worker worker : workers) {
            if (worker.getCpf().equals(cpf)) {
                System.out.println("A worker with this CPF already exists.");
                return; // stop method if duplicate CPF
            }
        }

        // Create new worker object
        Worker worker = new Worker(name, telephone, email, cpf);

        // Add worker to list
        workers.add(worker);

        System.out.println("Worker added successfully.");
    }

    // Method responsible for showing all workers
    public static void showWorkers(List<Worker> workers) {

        // If list is empty, inform user
        if (workers.isEmpty()) {
            System.out.println("No workers registered.");
            return;
        }

        // Print all workers
        System.out.println("\n=== LIST OF WORKERS ===");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }

    // Method responsible for removing a worker by CPF
    public static void removeWorker(List<Worker> workers, Scanner scanner) {

        // If list is empty, nothing to remove
        if (workers.isEmpty()) {
            System.out.println("No workers registered.");
            return;
        }

        // Ask for CPF to remove
        System.out.print("Enter the CPF of the worker to remove: ");
        String cpfToRemove = scanner.nextLine();

        // Remove worker whose CPF matches
        boolean removed = workers.removeIf(worker -> worker.getCpf().equals(cpfToRemove));

        // Inform result
        if (removed) {
            System.out.println("Worker removed successfully.");
        } else {
            System.out.println("No worker found with this CPF.");
        }

        // 🔥 IMPORTANT PART: show updated list automatically
        System.out.println("\nUpdated list of workers:");
        showWorkers(workers);
    }
}