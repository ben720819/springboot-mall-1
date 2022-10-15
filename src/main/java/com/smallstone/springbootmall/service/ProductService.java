package com.smallstone.springbootmall.service;

import com.smallstone.springbootmall.dto.ProductRequest;
import com.smallstone.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer productId);
}
