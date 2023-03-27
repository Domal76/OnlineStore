package ru.effective.shopSp.data._sourse.order;

import ru.effective.shopSp.data.model.Order;
import org.springframework.stereotype.Component;

@Component
public abstract class OrderDataSource {
    Order order;
    public abstract  void  createOrder (Order order);       //создание корзины
    public abstract Order getOrder();                       //просмотр корзины, работа с корзиной
}
