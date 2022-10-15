package com.smallstone.springbootmall.dao;

import com.smallstone.springbootmall.dto.ProductRequest;
import com.smallstone.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer productId);
}
