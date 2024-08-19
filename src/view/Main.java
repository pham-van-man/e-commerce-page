package view;

import controller.ProductController;
import repository.ProductRepository;
import service.ProductService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/study_case";
        String user = "root";
        String password = "012345678";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            ProductRepository productRepository = new ProductRepository(connection);
            ProductService productService = new ProductService(productRepository);
            ProductController productController = new ProductController(productService);
            ProductManagementUI ui = new ProductManagementUI(productController);
            ui.displayMenu();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error closing the database connection: " + e.getMessage());
                }
            }
        }
    }
}


