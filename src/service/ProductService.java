package service;

import model.Product;
import repository.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) throws SQLException {
        if (product.getPrice() > 0) {
            productRepository.addProduct(product);
        } else {
            throw new IllegalArgumentException("Giá phải lớn hơn 0");
        }
    }

    public List<Product> getAllProducts() throws SQLException {
        return productRepository.getAllProducts();
    }

    public void updateProduct(Product product) throws SQLException {
        if (product.getPrice() > 0) {
            productRepository.updateProduct(product);
        } else {
            throw new IllegalArgumentException("Giá phải lớn hơn 0");
        }
    }

    public void deleteProduct(int idProduct) throws SQLException {
        productRepository.deleteProduct(idProduct);
    }
}

