package ru.effective.shopSp.data._sourse.discoun;

import ru.effective.shopSp.data.model.Product;

public abstract class DiscountDataSource {
    abstract public int getDiscount(Product product) ;
}
