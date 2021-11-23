import StructureClass.Item;

import java.util.Arrays;
import java.util.Set;

public class ItemList {
    private Set<Item> itemList;

    public void setItemList(Set<Item> itemList) {
        this.itemList = itemList;
    }

    public Item FindItem(int itemCode){

        Item search = itemList.stream().filter(a-> itemCode == a.getItemCode()).findFirst().get();
        if (!search.equals(null)){
            return search;
        }
            return null;
    }

}
