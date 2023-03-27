package ru.effective.shopSp.data._sourse.cart;

import ru.effective.shopSp.data.model.CartItem;
import ru.effective.shopSp.data.model.Product;

import java.util.ArrayList;

public class MockDataSource extends CartDataSource {
    ArrayList <CartItem> cart = new ArrayList<>();               //только для Mock

    @Override
    public void addToCart(Product product, int count) {
        cart.add(new CartItem(product,count));
    }

    @Override
    public ArrayList<CartItem> getCart() {

        return cart;
    }
}
