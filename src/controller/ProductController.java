package controller;

import model.Product;
import service.ProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void addProduct(Product product) {
        try {
            productService.addProduct(product);
            System.out.println("Thêm thành công.");
        } catch (SQLException e) {
            System.out.println("Thêm thất bại: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Dữ liệu không hợp lệ: " + e.getMessage());
        }
    }

    public void displayAllProducts() {
        try {
            List<Product> products = productService.getAllProducts();
            for (Product product : products) {
                System.out.println(product);
            }
        } catch (SQLException e) {
            System.out.println("Không thể lấy sản phẩm: " + e.getMessage());
        }
    }

    public void updateProduct(Product product) {
        try {
            productService.updateProduct(product);
            System.out.println("Cập nhập sản phẩm thành công.");
        } catch (SQLException e) {
            System.out.println("Cập nhập sản phẩm thất bại: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Dữ liệu không hợp lệ: " + e.getMessage());
        }
    }

    public void deleteProduct(int idProduct) {
        try {
            productService.deleteProduct(idProduct);
            System.out.println("Xóa sản phẩm thành công.");
        } catch (SQLException e) {
            System.out.println("Xóa sản phẩm thất bại: " + e.getMessage());
        }
    }
}
