package repository;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private Connection connection;

    public ProductRepository(Connection connection) {
        this.connection = connection;
    }

    public void addProduct(Product product) throws SQLException {
        String query = "INSERT INTO product (name_product, price, name_category, describe_product) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, product.getNameProduct());
        preparedStatement.setDouble(2, product.getPrice());
        preparedStatement.setString(3, product.getNameCategory());
        preparedStatement.setString(4, product.getDescribeProduct());
        preparedStatement.executeUpdate();
    }

    public List<Product> getAllProducts() throws SQLException {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM product";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int idProduct = resultSet.getInt("id_product");
            String nameProduct = resultSet.getString("name_product");
            double price = resultSet.getDouble("price");
            String nameCategory = resultSet.getString("name_category");
            String describeProduct = resultSet.getString("describe_product");
            Product product = new Product(idProduct, nameProduct, price, nameCategory, describeProduct);
            products.add(product);
        }
        return products;
    }

    public void updateProduct(Product product) throws SQLException {
        String query = "UPDATE product SET name_product = ?, price = ?, name_category = ?, describe_product = ? WHERE id_product = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, product.getNameProduct());
        preparedStatement.setDouble(2, product.getPrice());
        preparedStatement.setString(3, product.getNameCategory());
        preparedStatement.setString(4, product.getDescribeProduct());
        preparedStatement.setInt(5, product.getIdProduct());
        preparedStatement.executeUpdate();
    }

    public void deleteProduct(int idProduct) throws SQLException {
        String query = "DELETE FROM product WHERE id_product = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, idProduct);
        preparedStatement.executeUpdate();
    }
}
