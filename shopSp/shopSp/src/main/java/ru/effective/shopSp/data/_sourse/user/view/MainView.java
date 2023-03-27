package ru.effective.shopSp.data._sourse.user.view;

import org.springframework.web.bind.annotation.RestController;
import ru.effective.shopSp.common.AppView;

import java.util.ArrayList;

public class MainView extends AppView {

    public MainView( ArrayList<AppView> page) {

        super("Магазин", page);
    }
}
