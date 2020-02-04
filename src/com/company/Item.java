package com.company;

import java.util.*;

public abstract class Item {
    //region Properties
    private String name;
    private double cost;

    //endregion

    //region Constructor
    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    //endregion

    //region Public Methods

    //endregion

    //region Equals,HashCode and toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = ( Item ) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product : " + this.getClass() + " - Cost: " + this.getCost();
    }

    //endregion

    //region Getter and Setter
    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    //endregion
}
