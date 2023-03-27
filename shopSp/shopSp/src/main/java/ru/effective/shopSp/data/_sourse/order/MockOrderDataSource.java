package ru.effective.shopSp.data._sourse.order;

import ru.effective.shopSp.data.model.Order;

public class MockOrderDataSource extends  OrderDataSource{


    @Override
   public void createOrder(Order order) {
        this.order = order;
    }

    @Override
    public Order getOrder() {

        return order;
    }
}
