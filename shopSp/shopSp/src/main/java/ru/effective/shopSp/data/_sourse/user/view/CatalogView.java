package ru.effective.shopSp.data._sourse.user.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.effective.shopSp.common.AppView;
import ru.effective.shopSp.data.model.Product;
import ru.effective.shopSp.data.service.ShopService;

import java.util.ArrayList;

public class CatalogView extends AppView {

    public CatalogView( ShopService shopService, ArrayList<AppView> page) {
        super("Каталог", page);
        this.shopService = shopService;
    }
    @Autowired
   final ShopService shopService;

    @Override
    public void action() {
        var catalog = shopService.getCatalog();
        for (Product product : catalog){
            System.out.println(product.title + " " + product.price);
        }
        System.out.println();
    }
}
