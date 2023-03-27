package ru.effective.shopSp.data.model;

public class User {
   public String login;
   public String mail;
    public String password;
    int balance;

    public User(String login, String mail, String password, int balance) {
        this.login = login;
        this.mail = mail;
        this.password = password;
        this.balance = balance;
    }
}
