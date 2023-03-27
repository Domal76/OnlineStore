package ru.effective.shopSp.data._sourse.user;

import org.springframework.stereotype.Component;
import ru.effective.shopSp.data.model.User;
@Component
public abstract class UserShop {
    User user;
    abstract  void  createUser (User user);
    abstract boolean getUser();
}
