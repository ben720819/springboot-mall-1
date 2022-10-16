package com.smallstone.springbootmall.service.impl;

import com.smallstone.springbootmall.dao.ProductDao;
import com.smallstone.springbootmall.dto.ProductQueryParams;
import com.smallstone.springbootmall.dto.ProductRequest;
import com.smallstone.springbootmall.model.Product;
import com.smallstone.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams)
    {
        List<Product> productList = productDao.getProducts(productQueryParams);

        return productList;
    }

    @Override
    public Integer countProduct(ProductQueryParams productQueryParams)
    {
        return productDao.countProduct(productQueryParams);
    }

    @Override
    public Product getProductById(Integer productId)
    {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest)
    {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest)
    {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProduct(Integer productId)
    {
        productDao.deleteProduct(productId);
    }
}
