package ru.effective.shopSp.data.model;

//корзина

public class CartItem {
    public Product product;
    public int count;

    public CartItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }
}
