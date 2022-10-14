package com.smallstone.springbootmall.dao;

import com.smallstone.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
