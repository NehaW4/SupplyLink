package com.edutech.progressive.service.impl;

import java.util.List;

import com.edutech.progressive.dao.ProductDAO;
import com.edutech.progressive.entity.Product;

public class ProductServiceImplJdbc implements ProductDAO {

    @Override
    public int addProduct(Product product) {
        return 0;
    }

    @Override
    public Product getProductById(int productId) {
       return null;
    }

    @Override
    public void updateProduct(Product product) {
       
    }

    @Override
    public void deleteProduct(int productId) {
        
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

}