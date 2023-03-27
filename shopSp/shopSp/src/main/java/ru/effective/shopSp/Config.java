package ru.effective.shopSp;

import ru.effective.shopSp.common.AppView;
import ru.effective.shopSp.common.PageLoop;
import ru.effective.shopSp.data._sourse.cart.CartDataSource;
import ru.effective.shopSp.data._sourse.cart.MockDataSource;
import ru.effective.shopSp.data._sourse.order.MockOrderDataSource;
import ru.effective.shopSp.data._sourse.order.OrderDataSource;
import ru.effective.shopSp.data._sourse.user.UserReal;
import ru.effective.shopSp.data._sourse.user.UserShop;
import ru.effective.shopSp.data._sourse.user.view.*;
import ru.effective.shopSp.data.service.ShopService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.effective.shopSp.data._sourse.catalog.CatalogDataSource;
import ru.effective.shopSp.data._sourse.catalog.CatalogPS;


import java.util.ArrayList;

@Configuration
@ComponentScan
public class Config {

    public CatalogDataSource catalog;
    public CartDataSource cartDataSource;
    public OrderDataSource orderDataSource;
    ShopService shopService;
    UserShop userShop;
    @Bean
    public  UserShop getUserShop (){return  new UserReal();}
    @Bean
    public CatalogDataSource getCatalog (){
        return new CatalogPS();
    }
    @Bean
    public CartDataSource getCart (){
        return  new MockDataSource();
    }
    @Bean
    public OrderDataSource getOrder (){
        return  new MockOrderDataSource();
    }

    public ShopService getShop () {
        ShopService shopService = new ShopService(catalog, cartDataSource, orderDataSource);
        return shopService.getShopService();
    }
    @Bean
    public ArrayList<AppView> getAppView (){
        AppView addToCard =  new AddToCartView(shopService);
        ArrayList<AppView> catalogPage = new ArrayList<>();
        catalogPage.add(addToCard);
        return catalogPage;
    }
    @Bean
    public AppView catalogView (){
        return new CatalogView(shopService, getAppView());
    }
    @Bean
    public AppView cartView (){
        return new CartView(shopService);
    }
    @Bean
    public AppView orderView (){
        return new OrderView(shopService);
    }
    @Bean
    public ArrayList<AppView> getMain (){
        ArrayList <AppView> mainPage = new ArrayList<>();
        AppView mainCatalogView = catalogView ();
        mainPage.add(mainCatalogView);
        AppView mainCartView = cartView ();
        mainPage.add(mainCartView);
        AppView mainOrderView = orderView ();
        mainPage.add(mainOrderView);
        AppView mainView = new MainView(mainPage);
        return new PageLoop(mainView).run();
    }



}
