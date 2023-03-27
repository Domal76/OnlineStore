package ru.effective.shopSp.data.view;

import ru.effective.shopSp.common.AppView;
import ru.effective.shopSp.data.model.CartItem;
import ru.effective.shopSp.data.service.ShopService;

import java.util.ArrayList;

//Просмотр корзины
public class CartView extends AppView {

    public CartView(ShopService shopService) {
        super("Корзина", new ArrayList<>());
        this.shopService = shopService;
    }

    public final ShopService shopService;
    @Override
    public void action() {
        ArrayList<CartItem> cart = shopService.getCart();
        for (CartItem cartItem : cart){
            System.out.println(cartItem.product.title + " " + cartItem.count);
        }
        System.out.println();
    }
}
