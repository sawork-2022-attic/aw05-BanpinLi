package com.micropos.carts.repository;

import com.micropos.carts.model.Cart;

public interface CartRepository {

    Cart getCart(String name);

    Cart addCart(String name, Cart cart);

}
