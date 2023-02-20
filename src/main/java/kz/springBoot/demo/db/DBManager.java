package kz.springBoot.demo.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Items> items = new ArrayList<>();

    static {
        items.add(new Items(1L, "IPhone 13", 500000));
        items.add(new Items(2L, "Xiaomi Redmi Note 9", 120000));
        items.add(new Items(3L, "Samsung Galaxy A51", 200000));
    }

    private static Long id = 4L;

    public static ArrayList<Items> getAllItems(){
        return items;
    }

    public static void addItem(Items item){
        item.setId(id);
        items.add(item);
        id++;
    }

    public static Items getItem(Long id){
        for(Items it : items){
            if(it.getId() == id){
                return it;
            }
        }
        return null;
    }
}
