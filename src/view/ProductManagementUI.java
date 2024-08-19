package view;

import controller.ProductController;
import model.Product;

import java.util.Scanner;

public class ProductManagementUI {
    private ProductController productController;
    private Scanner scanner;

    public ProductManagementUI(ProductController productController) {
        this.productController = productController;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("========== PRODUCT MANAGEMENT ==========");
            System.out.println("1. Add a new product");
            System.out.println("2. Display all products");
            System.out.println("3. Update a product");
            System.out.println("4. Delete a product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayAllProducts();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private void addProduct() {
//        System.out.print("Enter product name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter product price: ");
//        double price = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("Enter product quantity: ");
//        int quantity = scanner.nextInt();
//        scanner.nextLine();
//        Product product = new Product(name, price, quantity);
//        productController.addProduct(product);
    }

    private void displayAllProducts() {
        productController.displayAllProducts();
    }

    private void updateProduct() {
//        System.out.print("Enter product ID to update: ");
//        int idProduct = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("Enter new product name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter new product price: ");
//        double price = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("Enter new product quantity: ");
//        int quantity = scanner.nextInt();
//        scanner.nextLine();
//        Product product = new Product(idProduct, name, price, quantity);
//        productController.updateProduct(product);
    }

    private void deleteProduct() {
        System.out.print("Enter product ID to delete: ");
        int idProduct = scanner.nextInt();
        scanner.nextLine();
        productController.deleteProduct(idProduct);
    }
}

