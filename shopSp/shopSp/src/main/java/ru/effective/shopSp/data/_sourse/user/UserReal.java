package ru.effective.shopSp.data._sourse.user;

import ru.effective.shopSp.data.model.User;

import java.util.Scanner;

public class UserReal extends UserShop {
    @Override
    void createUser(User user) {

        this.user = user;
    }

    @Override
    public boolean getUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите логин");
        String login = scanner.nextLine();
        System.out.println("Ведите пароль");
        String password = scanner.nextLine();
        if (login.equals(user.login) && password.equals(user.password)) {
            System.out.println("Добро пожаловать, " + user.login);
            return  true;
        }
       else {
            System.out.println("Неправильно введён логин или пароль");
           return getUser();
       }
    }
}