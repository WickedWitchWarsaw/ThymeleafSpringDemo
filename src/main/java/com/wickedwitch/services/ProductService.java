package com.wickedwitch.services;

import com.wickedwitch.domain.Product;

import java.util.List;

/**
 * Created by ZuZ on 2017-01-17.
 */
public interface ProductService {
    Product getProduct(Integer id);
    List<Product> listProducts();
}
