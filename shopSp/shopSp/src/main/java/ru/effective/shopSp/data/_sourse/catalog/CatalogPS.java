package ru.effective.shopSp.data._sourse.catalog;

import ru.effective.shopSp.data.model.Product;

import java.util.ArrayList;

public class CatalogPS extends CatalogDataSource {
    Product product = new Product();
    String title = " ";      // DB.get.title
    int price = 0 ;          // DB.get.price

    public CatalogPS() {
        product = new Product(title, price, product.discount);
    }

    @Override
    public ArrayList <Product> getTitle() {
        ArrayList <Product> products = new ArrayList<>();
        while (true) {
            products.add(new Product(title, product.price, product.discount));
        }
    }
}
