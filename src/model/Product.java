package model;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private static final AtomicInteger ID = new AtomicInteger(0);
    private int idProduct;
    private String nameProduct;
    private double price;
    private String nameCategory;
    private String describeProduct;

    public Product(String nameProduct, double price, String nameCategory, String describeProduct) {
        this.idProduct = ID.getAndIncrement();
        this.nameProduct = nameProduct;
        this.price = price;
        this.nameCategory = nameCategory;
        this.describeProduct = describeProduct;
    }
    public Product(int idProduct, String nameProduct, double price, String nameCategory, String describeProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.nameCategory = nameCategory;
        this.describeProduct = describeProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getDescribeProduct() {
        return describeProduct;
    }

    public void setDescribeProduct(String describeProduct) {
        this.describeProduct = describeProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", nameCategory='" + nameCategory + '\'' +
                ", describeProduct='" + describeProduct + '\'' +
                '}';
    }
}
