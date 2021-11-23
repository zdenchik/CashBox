import StructureClass.Item;

import java.util.HashSet;
import java.util.Optional;

public class ItemList {
    private static HashSet<Item> itemList = initialize();

    private static HashSet<Item> initialize(){
        return new HashSet<>();
    }

    public static HashSet<Item> getItemList() {
        return itemList;
    }

    public static void setItemList(HashSet<Item> List){
        itemList = List;
    }

    public static void add(Item item){
        boolean a = itemList.add(item);
        if (!a){
            itemList.remove(item);
            itemList.add(item);
        }
    }

    public static Item FindItem(String itemCode){
        return itemList.stream().filter(a -> a.containsBarcode(itemCode)).findFirst().get();
    }

    public static Item FindItem(int itemCode){
        return itemList.stream().filter(a -> itemCode == a.getItemCode()).findFirst().get();
    }


}
