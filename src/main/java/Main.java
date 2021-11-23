import Constants.TaxList;
import StructureClass.Item;

public class Main {

    public static void main(String[] args) {

        ItemList.add(new Item("Бумага Обухов 1 шт",
                21186,5.50, TaxList.NO_TAX, new String[] {"979749779"}));

        ItemList.add(new Item("Пакет Химия Маленький 1 шт",
                21186,1.50, TaxList.NO_TAX, new String[] {"786763273"}));
        ItemList.add(new Item("Дилдо 1 шт",
                54697,55.98, TaxList.NO_TAX, new String[] {"7867867323"}));

        for (Item i : ItemList.getItemList()){
            System.out.println(i.toString());
        }

        ItemList.FindItem(21186).itemPrice = 100;

        System.out.println(ItemList.getItemList().toString());

        System.out.println(new ItemList().FindItem("786763273").itemName);
            //System.out.println(new ItemList().FindItem(21186).itemName);


    }


}

