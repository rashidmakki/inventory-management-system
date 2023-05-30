package com.inventorymanagementsystem.entity;

public class Billing {
    private String item_number;
    private int quantity;
    private double price;
    private double total_amount;

    public Billing(String item_number, int quantity, double price, double total_amount) {
        this.item_number = item_number;
        this.quantity = quantity;
        this.price = price;
        this.total_amount = total_amount;
    }

    public String getItem_number() {
        return item_number;
    }

    public void setItem_number(String item_number) {
        this.item_number = item_number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
}
