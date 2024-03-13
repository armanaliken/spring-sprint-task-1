package bitlab.spring.springfirst.db;

import bitlab.spring.springfirst.model.Item;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class dbManager {
    @Getter
    private static List<Item> itemList = new ArrayList<>();
    private static Long id = 8L;
    static {
        itemList.add(new Item(1L, "Arman", "Bekaidar", 100, ""));
        itemList.add(new Item(2L, "Ilias", "Menlikul", 70, ""));
        itemList.add(new Item(3L, "Abylai", "Amirbek", 65, ""));
        itemList.add(new Item(4L, "Zhankozha", "Karibaev", 85, ""));
        itemList.add(new Item(5L, "Madi", "Rabil", 45, ""));
        itemList.add(new Item(6L, "Aliken", "Kuanyshbekov", 95, ""));
        itemList.add(new Item(7L, "Arsen", "Bekaidar", 25, ""));
    }

    public static void createItem(Item item){
        item.setId(id);
        id++;
        itemList.add(item);
    }

    public static Item getItemById(Long id){
        return (Item) itemList.stream()
                .filter(item -> Objects.equals(item.getId(), id))
                .findFirst()
                .orElse(null);

    }
}
