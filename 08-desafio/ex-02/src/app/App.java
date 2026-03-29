package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Cria a lista que vai armazenar os candidatos
        List<Candidate> candidates = new ArrayList<>();

        // Nome do programa
        String programName = "University Entrance Exam Candidate Manager";

        // Variável para guardar a opção escolhida no menu
        int option;

        // Mensagem inicial
        System.out.println("Welcome to " + programName);

        // Laço principal do menu
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Add a new candidate");
            System.out.println("2 - List all candidates");
            System.out.println("3 - Exclude a candidate by registration number");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

            switch (option) {
                case 1:
                    // Cadastro de um novo candidato
                    System.out.print("Enter registration number: ");
                    String registrationNumber = scanner.nextLine();

                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine(); // Consome a quebra de linha

                    // Cria o objeto Candidate e adiciona na lista
                    Candidate candidate = new Candidate(registrationNumber, grade);
                    candidates.add(candidate);

                    System.out.println("Candidate added successfully!");
                    break;

                case 2:
                    // Lista todos os candidatos cadastrados
                    if (candidates.isEmpty()) {
                        System.out.println("No candidates registered.");
                    } else {
                        System.out.println("\nList of candidates:");
                        for (Candidate c : candidates) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 3:
                    // Exclui um candidato pelo número de inscrição
                    if (candidates.isEmpty()) {
                        System.out.println("No candidates registered.");
                    } else {
                        System.out.print("Enter registration number to exclude: ");
                        String regNumToExclude = scanner.nextLine();

                        boolean removed = candidates.removeIf(
                            candidateItem -> candidateItem.getRegistrationNumber().equals(regNumToExclude)
                        );

                        if (removed) {
                            System.out.println("Candidate excluded successfully!");

                            // Mostra a lista atualizada após exclusão
                            if (candidates.isEmpty()) {
                                System.out.println("No candidates remaining.");
                            } else {
                                System.out.println("\nUpdated list of candidates:");
                                for (Candidate c : candidates) {
                                    System.out.println(c);
                                }
                            }
                        } else {
                            System.out.println("Candidate not found.");
                        }
                    }
                    break;

                case 0:
                    // Encerra o programa
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    // Caso o usuário digite uma opção inválida
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 0);

        // Fecha o Scanner no final do programa
        scanner.close();
    }
}