package StructureClass;

import Constants.TaxList;

import java.util.Arrays;

public class Item {
    public String itemName;
    public int itemCode;
    public double itemPrice;
    public TaxList itemTax;
    public String[] barcodeArray;

    public Item(String itemName, int itemCode, double itemPrice, TaxList itemTax, String[] barcodeArray) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.itemPrice = itemPrice;
        this.itemTax = itemTax;
        this.barcodeArray = barcodeArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return getItemCode() == item.getItemCode();
    }

    @Override
    public int hashCode() {
        return getItemCode();
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemCode() {
        return itemCode;
    }

    public boolean containsBarcode(String barcode) {
        return Arrays.asList(barcodeArray).contains(barcode);
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemCode=" + itemCode +
                ", itemPrice=" + itemPrice +
                ", itemTax=" + itemTax +
                ", barcodeArray=" + Arrays.toString(barcodeArray) +
                '}';
    }
}
