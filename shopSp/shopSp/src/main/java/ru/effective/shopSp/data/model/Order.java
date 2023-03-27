package ru.effective.shopSp.data.model;


import java.util.ArrayList;

//обработка заказа
public class Order {
    String name;
    String phone;
    String address;
    String paymentType;
    String deliveryTime;
    ArrayList<CartItem> cart;
    public Order(String name, String phone, String address, String paymentType, String deliveryTime, ArrayList<CartItem> cart) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.paymentType = paymentType;
        this.deliveryTime = deliveryTime;
        this.cart = cart;
    }
}

