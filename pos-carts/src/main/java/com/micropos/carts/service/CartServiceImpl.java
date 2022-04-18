package com.micropos.carts.service;

import com.micropos.carts.dto.ProductDto;
import com.micropos.carts.model.Cart;
import com.micropos.carts.model.Item;
import com.micropos.carts.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public boolean update(ProductDto productDto, int amount, String username) {
        Item item = new Item(productDto, amount);
        Cart cart = cartRepository.getCart(username);
        return cart.updateItem(item);
    }

    @Override
    public boolean updateIncrement(ProductDto productDto, String username) {
        Cart cart = cartRepository.getCart(username);
        Item item = cart.queryItemByProductId(productDto.getId());
        return update(productDto, item.getQuantity() + 1, username);
    }

    @Override
    public boolean updateDecrease(ProductDto productDto, String username) {
        Cart cart = cartRepository.getCart(username);
        Item item = cart.queryItemByProductId(productDto.getId());
        if(item.getQuantity() == 1) {
            return remove(productDto, username);
        }
        return update(productDto, item.getQuantity() - 1, username);
    }

    @Override
    public boolean remove(ProductDto productDto, String username) {
        Cart cart = cartRepository.getCart(username);
        Item item = cart.queryItemByProductId(productDto.getId());
        return cart.deleteItem(item);
    }

    @Override
    public boolean save(ProductDto productDto, String username) {
        Cart cart = cartRepository.getCart(username);
        Item item = new Item(productDto, 1);
        return cart.addItem(item);
    }

    @Override
    public boolean emptyCart(String username) {
        return cartRepository.getCart(username).clear();
    }

    @Override
    public Cart createCart(String username) {
        return cartRepository.addCart(username, new Cart());
    }

    @Override
    public Cart getCart(String username) {
        return cartRepository.getCart(username);
    }
}
