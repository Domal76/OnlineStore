package ru.effective.shopSp.data.model;

public class Product {

   public String title;
   public String description;
   public String organization;
   public int price;
   public int quantity;
   public int discount;
   public String review;
   public String keywords;
   public String performanceTables;
   public int grade;

   public Product(String title, int price, int discount){

      this.title = title;
   }

   public Product() {
      this.title = title;
      this.price = price;
      this.discount = discount;
   }
   public Product (String review, int grade){
      this.review = review;
      this.grade = grade;
   }
}
