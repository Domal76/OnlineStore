package ru.effective.shopSp.data._sourse.discoun;

import ru.effective.shopSp.data.model.Product;

public class DiscountShop extends DiscountDataSource {
    Product product;
    int discount = product.discount;
    String productId = " ";                  // DB.get.productId
    boolean discountDuration = true;               // DB.get.discountDuration

    @Override
    public int getDiscount(Product product) {
        if (product.title.equals(productId)) {
            if (discountDuration) {
                product.price -= product.price * discount;
            }
        }
        return product.price;
    }
}