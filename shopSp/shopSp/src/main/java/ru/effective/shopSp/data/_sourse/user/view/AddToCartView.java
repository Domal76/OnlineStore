package ru.effective.shopSp.data._sourse.user.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.effective.shopSp.common.AppView;
import ru.effective.shopSp.data.service.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

public class AddToCartView extends AppView {

    public AddToCartView(ShopService shopService) {
        super("Добавить товар", new ArrayList<>());
        this.shopService = shopService;
    }
    @Autowired
    ShopService shopService;

    @Override
    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название продукта");
        String productId = scanner.nextLine();
        if (productId == null)
            return;
        System.out.println("Введите количество продукта");
        int count = scanner.nextInt();
        boolean res = shopService.addCart(productId, count);
        if (res) {
            System.out.println("Товар добавлен");
        } else {
            System.out.println("Не удалось добавмть товар");
        }

    }
}
