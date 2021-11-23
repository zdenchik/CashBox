import Constants.TaxList;
import StructureClass.Item;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ItemList.add(new Item("Бумага Обухов 1 шт",
                21186,5.50, TaxList.NO_TAX, new ArrayList<>()));

        ItemList.add(new Item("Пакет Химия Маленький 1 шт",
                21186,1.50, TaxList.NO_TAX, new ArrayList<>()));
        ItemList.add(new Item("Дилдо 1 шт",
                54697,55.98, TaxList.NO_TAX, new ArrayList<>()));


        ItemList.FindItem(21186).itemPrice = 100;
        ItemList.FindItem(21186).barcodeArray.add("786763273");
        System.out.println(ItemList.getItemList().toString());
        ItemList.FindItem("786763273").itemName = "Потеряйся";

        try {
            System.out.println(ItemList.FindItem("786763273"));
        }catch (NoSuchElementException e){
            System.out.println("Item with code 786763273 not found");
        }
        System.out.println(ItemList.FindItem(54697));
            //System.out.println(new ItemList().FindItem(21186).itemName);


    }


}

