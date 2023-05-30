package com.inventorymanagementsystem.entity;

public class Purchase {
    private int id;
    private String invoice;
    private String shopDetails;
    private int totalItems;
    private Double totalAmount;
    private String dateOfPurchase;

    public Purchase(int id, String invoice, String shopDetails, int totalItems, Double totalAmount, String dateOfPurchase) {
        this.id = id;
        this.invoice = invoice;
        this.shopDetails = shopDetails;
        this.totalItems = totalItems;
        this.totalAmount = totalAmount;
        this.dateOfPurchase = dateOfPurchase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getShopDetails() {
        return shopDetails;
    }

    public void setShopDetails(String shopDetails) {
        this.shopDetails = shopDetails;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
