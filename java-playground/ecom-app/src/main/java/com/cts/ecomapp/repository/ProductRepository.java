package com.cts.ecomapp.repository;

import com.cts.ecomapp.exception.InvalidProductException;
import com.cts.ecomapp.exception.ProductNotFoundException;
import com.cts.ecomapp.model.Product;

import java.util.List;

public interface ProductRepository {

    Product addProduct(Product product) throws InvalidProductException;

    Product findProduct(int id) throws ProductNotFoundException;

    Product findProductByName(String name) throws ProductNotFoundException;

    List<Product> getAllProducts();

    void deleteProduct(int id) throws ProductNotFoundException;

}
