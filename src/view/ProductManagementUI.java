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
            System.out.println("========== QUẢN LÝ SẢN PHẨM ==========");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. Hiển thị tất cả sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
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
                    System.out.println("Thoát khỏi chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
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
        System.out.print("Nhập ID sản phẩm để xóa: ");
        int idProduct = scanner.nextInt();
        scanner.nextLine();
        productController.deleteProduct(idProduct);
    }
}

