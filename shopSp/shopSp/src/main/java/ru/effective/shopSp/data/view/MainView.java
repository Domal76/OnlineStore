package ru.effective.shopSp.data.view;

import ru.effective.shopSp.common.AppView;


import java.util.ArrayList;

public class MainView extends AppView {

    public MainView(ArrayList<AppView>children) {
        super("Магазин", children);
    }
}
