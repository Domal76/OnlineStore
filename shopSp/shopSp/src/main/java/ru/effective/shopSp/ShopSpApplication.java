package ru.effective.shopSp;
import ru.effective.shopSp.data._sourse.user.UserShop;
import ru.effective.shopSp.data.service.ShopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ShopSpApplication {

	public static void main(String[] args) {

		var context =SpringApplication.run(ShopSpApplication.class, args);
		UserShop userShop = context.getBean(UserShop.class);
		ShopService shopService = context.getBean(ShopService.class);

		var sh = shopService.getShopService();

	}
}
