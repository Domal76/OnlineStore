package ru.effective.shopSp.data.service;

import ru.effective.shopSp.data._sourse.cart.CartDataSource;
import ru.effective.shopSp.data._sourse.catalog.CatalogDataSource;
import ru.effective.shopSp.data._sourse.discoun.DiscountDataSource;
import ru.effective.shopSp.data._sourse.discoun.DiscountShop;
import ru.effective.shopSp.data._sourse.order.OrderDataSource;
import ru.effective.shopSp.data._sourse.review.ReviewProduct;
import ru.effective.shopSp.data._sourse.review.ReviewProductImpl;
import ru.effective.shopSp.data._sourse.user.HistoryUser;
import ru.effective.shopSp.data.model.CartItem;
import ru.effective.shopSp.data.model.Order;
import ru.effective.shopSp.data.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
//Класс для реализаций методов с БД, корзиной  и обработкой заказа
@Component
public class ShopService {
    @Autowired
    CatalogDataSource catalog;
    @Autowired
    CartDataSource cartDataSource;
    @Autowired
    OrderDataSource orderDataSource;

    public ShopService(CatalogDataSource catalog, CartDataSource cartDataSource, OrderDataSource orderDataSource) {
        this.catalog = catalog;
        this.cartDataSource = cartDataSource;
        this.orderDataSource = orderDataSource;
    }
    public ShopService getShopService (){

        return new ShopService( catalog, cartDataSource,orderDataSource);
    }

   public ArrayList <Product> getCatalog (){                      //получение каталога

        return catalog.getTitle();
    }
    public boolean addCart (String titles, int count){          //корзина
        ArrayList <Product> products = getCatalog();
        DiscountDataSource discount = new DiscountShop();

        for (Product p : products){
            if (p.title.equals(titles)){
                cartDataSource.addToCart(p, count);
                p.discount = discount.getDiscount(new Product());
                return  true;
            }
        } return  false;
    }
    public  ArrayList<CartItem> getCart (){                    //получение корзины
        return  cartDataSource.getCart();
    }

    public void createOrder (String name, String phone, String address, String paymentType, String deliveryTime){   //создание заказа
        ArrayList<CartItem> cart = getCart() ;
        Order newOrder = new Order(name, phone, address, paymentType, deliveryTime, cart);
        orderDataSource.createOrder(newOrder);

    }
     HistoryUser historyUser = new HistoryUser();

    public ArrayList<CartItem> getHistoryUser() {
        return historyUser.historyPurchase();
    }
    public void leaveFeedback (){
        System.out.println("Хотите оставить отзыв о купленном товаре?");
    ReviewProduct reviewProduct = new ReviewProductImpl();
        reviewProduct.setReview();}
}
