package com.micropos.carts.model;

import com.micropos.carts.dto.ProductDto;

public class Item {
    private ProductDto product;
    private int quantity;

    public Item(ProductDto product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Item() {
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
