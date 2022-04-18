package com.micropos.carts.repository;

import com.micropos.carts.model.Cart;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CartRepositoryImpl implements CartRepository {

    private Map<String, Cart> rep = new HashMap<>();

    @Override
    public Cart getCart(String username) {
        return rep.get(username);
    }

    @Override
    public Cart addCart(String username, Cart cart) {
        return rep.put(username, cart);
    }
}
