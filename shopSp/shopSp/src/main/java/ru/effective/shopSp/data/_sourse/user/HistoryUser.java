package ru.effective.shopSp.data._sourse.user;

import ru.effective.shopSp.data.model.CartItem;
import ru.effective.shopSp.data.service.ShopService;

import java.util.ArrayList;

public class HistoryUser {
    ShopService shopService;

   public ArrayList<CartItem> historyPurchase (){
        ArrayList <CartItem> purchase = shopService.getCart();
        ArrayList <CartItem> history = new ArrayList<>();
        for (CartItem p : purchase) {
            history.add(p);
        }
        return history;
    }

    public void displayHistoryPurchase (){
        ArrayList <CartItem> purchase =historyPurchase();
        for (CartItem p : purchase) {
            System.out.println(p);
        }
    }
}
