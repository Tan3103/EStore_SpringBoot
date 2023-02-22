package kz.springBoot.demo.services;

import kz.springBoot.demo.entities.Countries;
import kz.springBoot.demo.entities.ShopItems;

import java.util.List;

public interface ItemService {

    ShopItems addItem(ShopItems items);
    List<ShopItems> getAllItems();
    ShopItems getItem(Long id);
    void deleteItem(ShopItems item);
    ShopItems updateItem(ShopItems item);

    Countries addCountry(Countries country);
    List<Countries> getAllCountries();
    Countries getCountry(Long id);
    Countries updateItem(Countries country);

}
