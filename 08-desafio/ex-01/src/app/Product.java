package app;

// Classe que representa um produto
public class Product {

    // Atributos do produto
    private String name;
    private double price;

    // Construtor: cria um produto com nome e preço
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter para o nome
    public String getName() {
        return name;
    }

    // Getter para o preço
    public double getPrice() {
        return price;
    }

    // Método para exibir o produto de forma bonita
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}