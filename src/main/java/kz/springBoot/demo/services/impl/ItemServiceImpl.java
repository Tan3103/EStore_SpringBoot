package kz.springBoot.demo.services.impl;

import kz.springBoot.demo.entities.Countries;
import kz.springBoot.demo.entities.ShopItems;
import kz.springBoot.demo.repositories.CountryRepository;
import kz.springBoot.demo.repositories.ItemRepository;
import kz.springBoot.demo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public ShopItems addItem(ShopItems items) {
        return itemRepository.save(items);
    }

    @Override
    public List<ShopItems> getAllItems() {
        return itemRepository.findAllByAmountGreaterThanOrderByPriceDesc(0);
    }

    @Override
    public ShopItems getItem(Long id) {
        return itemRepository.findByIdAndAmountGreaterThan(id, 0);
    }

    @Override
    public void deleteItem(ShopItems item) {
        itemRepository.delete(item);
    }

    @Override
    public ShopItems updateItem(ShopItems item) {
        return itemRepository.save(item);
    }

    @Override
    public Countries addCountry(Countries country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Countries> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Countries getCountry(Long id) {
        return countryRepository.getById(id);
    }

    @Override
    public Countries updateItem(Countries country) {
        return countryRepository.save(country);
    }
}
