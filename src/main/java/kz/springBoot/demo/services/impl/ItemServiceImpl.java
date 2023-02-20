package kz.springBoot.demo.services.impl;

import kz.springBoot.demo.entities.ShopItems;
import kz.springBoot.demo.repositories.ItemRepository;
import kz.springBoot.demo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

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
}
