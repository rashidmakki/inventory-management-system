package com.inventorymanagementsystem.entity;

public class Sales {
    private int id;
    private String inv_num;

    private int cust_id;

    private String custName;

    private double price;
    private int quantity;

    private double total_amount;

    private String date;

    private String item_num;

    public Sales(int id, String inv_num, int cust_id, String custName, double price, int quantity, double total_amount, String date, String item_num) {
        this.id = id;
        this.inv_num = inv_num;
        this.cust_id = cust_id;
        this.custName = custName;
        this.price = price;
        this.quantity = quantity;
        this.total_amount = total_amount;
        this.date = date;
        this.item_num = item_num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInv_num() {
        return inv_num;
    }

    public void setInv_num(String inv_num) {
        this.inv_num = inv_num;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getItem_num() {
        return item_num;
    }

    public void setItem_num(String item_num) {
        this.item_num = item_num;
    }
}
