package kz.springBoot.demo.controllers;

import kz.springBoot.demo.db.DBManager;
import kz.springBoot.demo.db.Items;
import kz.springBoot.demo.entities.ShopItems;
import kz.springBoot.demo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ItemService itemService;

    @GetMapping(value = "/")
    public String index(Model model){

        List<ShopItems> items = itemService.getAllItems();
        model.addAttribute("tovary", items);

        return "index";
    }

    @GetMapping(value = "/about")
    public String about(){
        ShopItems item = new ShopItems();

        if(item != null){
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
            itemService.updateItem(item);
        }

        return "about";
    }

    @PostMapping(value = "/additem")
    public String addItem(@RequestParam(name = "item_name", defaultValue = "No Item") String name,
                          @RequestParam(name = "item_price", defaultValue = "0") int price,
                          @RequestParam(name = "item_amount", defaultValue = "0") int amount){

        itemService.addItem(new ShopItems(null, name, price, amount));

        return "redirect:/";
    }

    @GetMapping(value = "/details/{idshka}")
    public String details(Model model, @PathVariable(name = "idshka") Long id){

        ShopItems item = itemService.getItem(id);
        model.addAttribute("item", item);

        return "details";
    }

    @PostMapping(value = "/saveitem")
    public String saveItem(@RequestParam(name = "id", defaultValue = "0") Long id,
                           @RequestParam(name = "item_name", defaultValue = "No Item") String name,
                           @RequestParam(name = "item_price", defaultValue = "0") int price,
                           @RequestParam(name = "item_amount", defaultValue = "0") int amount){

        ShopItems item = itemService.getItem(id);

        if(item != null){
            item.setName(name);
            item.setPrice(price);
            item.setAmount(amount);
            itemService.updateItem(item);
        }

        return "redirect:/";
    }

    @PostMapping(value = "/deleteitem")
    public String saveItem(@RequestParam(name = "id", defaultValue = "0") Long id){

        ShopItems item = itemService.getItem(id);

        if(item != null){
            itemService.deleteItem(item);
        }

        return "redirect:/";
    }
}
