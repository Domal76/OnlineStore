package ru.effective.shopSp.common;

import java.util.ArrayList;
import java.util.Scanner;

//цикл действий на странице
public class PageLoop {
    final  AppView view;


    public PageLoop(AppView view) {
        this.view = view;
    }
   public ArrayList<AppView> run(){                           //метод запускает цикл
        while (true){
            view.action();
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();          //выбор страницы
            if (value <0 || value > view.page.size()+1){
                System.out.println("Неверно выбрано значение");
            }
            else if (value == view.page.size()+1){
                break;
            }
            else {
                AppView selectView = view.page.get(value-1);
               new  PageLoop(selectView).run();
            }
        }
       return null;
   }
    public void displayPage() {                                  //вывод на экран
        System.out.println(view.choice);
        System.out.println("Выберите вариант от 1 до " + (view.page.size() +1));
        int i;
        for (i = 0; i < view.page.size(); i++){
        AppView subView = view.page.get(i);
            System.out.println(i + " - " + subView.choice);
        }
        System.out.println((view.page.size() +1) + " - Назад");
    }
}
