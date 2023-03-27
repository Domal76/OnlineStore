package ru.effective.shopSp.data.view;

import ru.effective.shopSp.common.AppView;
import ru.effective.shopSp.data.service.ShopService;
import java.util.ArrayList;
import java.util.Scanner;

public class AddToCartView extends AppView {

    public AddToCartView(ShopService shopService) {
        super("Добавить товар", new ArrayList<>());
        this.shopService = shopService;
    }
   public final ShopService shopService;
    @Override
     public void action (){
         Scanner in = new Scanner(System.in);
         System.out.println("Введите id продукта");
         String productId = in.nextLine();
         if (productId == null) return;
        System.out.println("Введите количество продукта");
        int count = in.nextInt();

         final boolean res = shopService.addCart(productId, count);
         if (res){
             System.out.println("Товар добавлен");
         }
         else System.out.println("Не удалось добавить");

     }

}
