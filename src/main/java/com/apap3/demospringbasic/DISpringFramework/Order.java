package com.apap3.demospringbasic.DISpringFramework;

import java.util.List;

public class Order {
    private int orderId;
    private String customerName;
    private List<Item> items;

    // Constructor, getters, and setters

    public void addItem(Item item) {
        items.add(item);
    }
}

