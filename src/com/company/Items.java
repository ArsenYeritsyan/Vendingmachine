package com.company;

public class Items {
    private String name;
    private int count;
    private double cost;

    public Items(String name, int count, double cost) {
        this.name = name;
        this.count = count;
        this.cost = cost;
    }

    int itemCount() {
        if (this.count > 0) {
            this.count--;
        } else {
            System.out.println(this.name + " count is 0 !!! ");
        }
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
