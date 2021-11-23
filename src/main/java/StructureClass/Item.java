package StructureClass;

import Constants.TaxList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Item {
    private String itemName;
    private int itemCode;
    private long itemPrice;
    private TaxList itemTax;
    private int[] barcodeArray;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return getItemCode() == item.getItemCode() &&
                getItemName().equals(item.getItemName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemName(), getItemCode());
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public long getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public TaxList getItemTax() {
        return itemTax;
    }

    public void setItemTax(TaxList itemTax) {
        this.itemTax = itemTax;
    }

    public int[] getBarcodeArray() {
        return barcodeArray;
    }

    public void setBarcodeArray(int[] barcodeArray) {
        this.barcodeArray = barcodeArray;
    }
}
