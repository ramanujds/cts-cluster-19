package com.cts.ecomapp.repository;

import com.cts.ecomapp.exception.InvalidProductException;
import com.cts.ecomapp.exception.ProductNotFoundException;
import com.cts.ecomapp.model.Category;
import com.cts.ecomapp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    List<Product> products = new ArrayList<>();

    private Product pd;

    public Product addProduct(Product product) throws InvalidProductException {
        products.add(product);
        return product;
    }

    public Product findProduct(int id) throws ProductNotFoundException {

        return products.stream().filter(p -> p.getId() == id).findFirst().get();

    }

    // TODO: Complete the code
    public Product findProductByName(String name) throws ProductNotFoundException {
        return null;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void deleteProduct(int id) throws ProductNotFoundException {
//        Product product = findProduct(id);
//        products.remove(product);

        products.removeIf(p -> p.getId() == id);

    }

    public List<Product> findProductsByCategory(Category category) {
        return products.stream().filter(p -> p.getCategory() == category).toList();
    }

    // TODO: Complete the code
    public List<Product> findProductsByCategory(Category category, double minPrice, double maxPrice) {
        return List.of();
    }
}
