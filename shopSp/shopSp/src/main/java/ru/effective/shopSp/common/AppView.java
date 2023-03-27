package ru.effective.shopSp.common;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.effective.shopSp.data.service.ShopService;

import java.util.ArrayList;

//класс для выбора действий пользователем
@RestController
public abstract class AppView {
   public final String choice;                        //выбор на странице
   public final ArrayList <AppView> page;             //варианты действий (выбор страницы)


    public AppView(String choice, ArrayList<AppView> page) {
        this.choice = choice;
        this.page = page;
    }
    @GetMapping
    public void action (){}                           //исполнение выбранного

}
