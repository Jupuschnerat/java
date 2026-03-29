package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Lista que armazena os produtos
        List<Product> products = new ArrayList<>();

        // Variável de controle do loop
        boolean running = true;

        // Nome do sistema
        System.out.println("=== Welcome to the Product Manager! ===");

        // Loop principal do programa
        while (running) {

            // Menu
            System.out.println("\nMenu:");
            System.out.println("1. Add product");
            System.out.println("2. Show all products");
            System.out.println("3. Exclude a product by name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // limpa buffer

            switch (option) {

                case 1:
                    // Adicionar produto
                    System.out.print("Enter the name of the product: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter the price of the product: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // limpa buffer

                    Product newProduct = new Product(name, price);
                    products.add(newProduct);

                    System.out.println("Product added: " + newProduct);
                    break;

                case 2:
                    // Mostrar produtos
                    if (products.isEmpty()) {
                        System.out.println("No products registered.");
                    } else {
                        System.out.println("\n=== Product List ===");

                        for (int i = 0; i < products.size(); i++) {
                            System.out.println((i + 1) + ". " + products.get(i));
                        }
                    }
                    break;

                case 3:
                    // Remover produto pelo nome
                    System.out.print("Enter the name of the product to exclude: ");
                    String productName = scanner.nextLine();

                    boolean removed = false;

                    for (int i = 0; i < products.size(); i++) {
                        if (products.get(i).getName().equalsIgnoreCase(productName)) {
                            products.remove(i);
                            removed = true;
                            System.out.println("Product removed successfully!");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Product not found.");
                    }

                    // Mostrar lista atualizada automaticamente
                    if (products.isEmpty()) {
                        System.out.println("No products registered.");
                    } else {
                        System.out.println("\n=== Updated Product List ===");
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println((i + 1) + ". " + products.get(i));
                        }
                    }

                    break;

                case 4:
                    // Sair
                    System.out.println("Exiting the program. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}