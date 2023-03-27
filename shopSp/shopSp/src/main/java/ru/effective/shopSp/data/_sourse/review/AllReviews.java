package ru.effective.shopSp.data._sourse.review;

import ru.effective.shopSp.data.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AllReviews {
    Product product;
    ReviewProduct reviewProduct;
    Map<String, ArrayList<String>> reviews = new HashMap<>();
    ArrayList <String> reviewsDisplay = new ArrayList<>();
   public Map<String, ArrayList<String>> allReviews () {
       if (!reviews.containsKey(product.title)) {
           reviewsDisplay.add(reviewProduct.getReview());
           reviews.put(product.title, reviewsDisplay);
       } else {
           ArrayList<String> newReviews = reviews.get(product.title);
           newReviews.add(reviewProduct.getReview());
           reviews.put(product.title, newReviews);
       }return reviews;
   }
}
