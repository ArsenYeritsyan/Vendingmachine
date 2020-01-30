package com.company;

import java.util.ArrayList;
import java.util.List;

public class Items {
    private String name;
    private double cost;
    private List<Character> itemList;

    public Items(String name, double cost) {
        this.name = name;
        this.cost = cost;
        itemList = new ArrayList<Character>(10);
    }

    void addProduct() {
        itemList.add(' ');
    }

    void removeProduct() {
        itemList.remove(0);
    }

    int getProductCountity() {
        return itemList.size();
    }

    @Override
    public String toString() {
        return "Product : "+name+" - countity: "+itemList.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<Character> getItemList() {
        return itemList;
    }

    public void setItemList(List<Character> itemList) {
        this.itemList = itemList;
    }
}
