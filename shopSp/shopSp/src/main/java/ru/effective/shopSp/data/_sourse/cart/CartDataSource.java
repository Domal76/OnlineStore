package ru.effective.shopSp.data._sourse.cart;

import ru.effective.shopSp.data.model.CartItem;
import ru.effective.shopSp.data.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public abstract class CartDataSource {
   public abstract void addToCart (Product product, int count);   //добавление в корзину
   public abstract ArrayList<CartItem> getCart ();                   //просмотр корзины
}
