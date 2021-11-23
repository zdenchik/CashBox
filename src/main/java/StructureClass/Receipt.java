package StructureClass;

import Constants.PaymentType;
import Constants.ReceiptType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Receipt {

    private final ReceiptType receiptType; //Type of operation (default is Purchase)
    private final LocalDate time; //Time of a receipt
    private final long number; //Unique number

    //Time and indicator - when and was receipt send to the server
    private boolean receiptSend;
    private LocalDateTime sendingTime;

    protected int discountCard;
    protected PaymentType paymentType;

    protected String cashier; //String is a temp value@!!! need`s to be replaced with a Cashier class in future
    protected Long paymentAmount;

    protected ArrayList<GoodsList> goodsList; //Goods storage
    
    //Default constructor
    public Receipt(ReceiptType receiptType,int number) {
        this.number = number;
        this.receiptType = receiptType;
        this.time = LocalDate.now();
    }

    //-----------------------Getters zone----------------------------------------
    public ReceiptType getReceiptType() {
        return receiptType;
    }

    public LocalDate getTime() {
        return time;
    }

    public long getNumber() {
        return number;
    }
}
