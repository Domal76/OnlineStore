package ru.effective.shopSp.data._sourse.catalog;

import ru.effective.shopSp.data.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public abstract class CatalogDataSource {
  abstract public ArrayList<Product> getTitle() ;         //создание каталога

}
