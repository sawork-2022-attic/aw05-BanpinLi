package com.micropos.carts.service;

import com.micropos.carts.dto.ProductDto;
import com.micropos.carts.model.Cart;

public interface CartService {

    boolean update(ProductDto productDto, int amount, String username);

    boolean updateIncrement(ProductDto productDto, String username);

    boolean updateDecrease(ProductDto productDto, String username);

    boolean remove(ProductDto productDto, String username);

    boolean save(ProductDto productDto, String username);

    boolean emptyCart(String username);

    Cart createCart(String username);

    Cart getCart(String username);

}
