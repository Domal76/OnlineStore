package ru.effective.shopSp.data.view;

import ru.effective.shopSp.common.AppView;
import ru.effective.shopSp.data.service.ShopService;

import java.util.ArrayList;
import java.util.Scanner;

//Оформить заказ
public class OrderView extends AppView {

    public OrderView(ShopService shopService) {
        super("Оформление заказа", new ArrayList<>());
        this.shopService = shopService;
    }

    public final ShopService shopService;
    @Override
    public void action() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите своё имя");
        String name = in.nextLine();
        System.out.println("Введите свой телефон");
        String phone = in.nextLine();
        System.out.println("Введите адрес доставки");
        String address = in.nextLine();
        System.out.println("Введите метод оплаты");
        String paymentType = in.nextLine();
        System.out.println("Введите удобное время доставки");
        String deliveryTime = in.nextLine();

        shopService.createOrder(name, phone, address, paymentType, deliveryTime );
    }
}
