package ru.effective.shopSp.data._sourse.user.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.effective.shopSp.common.AppView;
import ru.effective.shopSp.data.model.CartItem;
import ru.effective.shopSp.data.model.Product;
import ru.effective.shopSp.data.service.ShopService;

import java.util.ArrayList;

public class CartView extends AppView {

    public CartView(ShopService shopService) {
        super("Корзина", new ArrayList<>());
        this.shopService = shopService;
    }
    @Autowired
   final ShopService shopService;

    @Override
    public void action() {
        ArrayList <CartItem> cartItems = shopService.getCart();
        for (CartItem cart : cartItems){
            System.out.println(cart.product.title + " " + cart.product.price);
        }
        System.out.println();
    }
}
