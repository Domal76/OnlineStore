package ru.effective.shopSp.data.view;

import ru.effective.shopSp.common.AppView;
import ru.effective.shopSp.data.model.Product;
import ru.effective.shopSp.data.service.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView {


    public CatalogView(ShopService shopService, ArrayList<AppView>children) {
        super("Каталог", children);
        this.shopService = shopService;
        }


    public final ShopService shopService;
    @Override
    public void action() {
        ArrayList<Product> catalog = shopService.getCatalog();
        for (Product product : catalog){
            System.out.println(product.title + " " + product.price);
        }
        System.out.println();
    }
}
