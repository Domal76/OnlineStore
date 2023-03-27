package ru.effective.shopSp.data._sourse.review;

import ru.effective.shopSp.data.model.Product;
import ru.effective.shopSp.data.model.User;

import java.util.Scanner;

public class ReviewProductImpl extends  ReviewProduct{
    public String review;
    public int grade;
    public ReviewProductImpl(String review, int grade) {
        this.review = review;
        this.grade = grade;
    }

    public ReviewProductImpl() {
    }

    Product product;
    User user;
    @Override
    public ReviewProductImpl setReview (){
        System.out.println("Покупатель, оставьте свой отзыв о товаре!");
        Scanner scanner = new Scanner(System.in);
        review = scanner.nextLine();
        System.out.println("Покупатель, поставьте оценку товару: от 1 до 5");
        grade = scanner.nextInt();
        return new ReviewProductImpl(review,grade);
    }


    @Override
    public String getReview (){
        ReviewProductImpl reviewProduct = setReview();
        System.out.println("Оценка товара от пользователя " + user.login + ": "+ reviewProduct.grade);
        System.out.println("Отзыв о товаре: " + product.title + " - " + reviewProduct.review + "/n");
        return null;
    }
}
