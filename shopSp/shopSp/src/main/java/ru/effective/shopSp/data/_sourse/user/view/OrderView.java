package ru.effective.shopSp.data._sourse.user.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.effective.shopSp.common.AppView;
import ru.effective.shopSp.data.model.Product;
import ru.effective.shopSp.data.service.ShopService;

import java.util.ArrayList;
import java.util.Scanner;


public class OrderView extends AppView {

    public OrderView(ShopService shopService) {
        super("Оформление заказа", new ArrayList<>());
        this.shopService = shopService;
    }
    @Autowired
   final ShopService shopService;

    @Override
    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё имя");
        String name = scanner.nextLine();
        System.out.println("Введите номер телефона");
        String phone = scanner.nextLine();
        System.out.println("Введите адрес доставки");
        String address = scanner.nextLine();
        System.out.println("Введите способ оплаты");
        String paymentType = scanner.nextLine();
        System.out.println("Введите удобное время доставки");
        String deliveryTime = scanner.nextLine();

        shopService.createOrder(name, phone,address, paymentType, deliveryTime);
    }
}
