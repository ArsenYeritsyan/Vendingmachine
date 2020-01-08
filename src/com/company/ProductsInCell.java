package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductsInCell {

    //public static HashMap<String , HashMap> products;
    private List<Items> drink = new ArrayList<>();
    private List<Items> chips = new ArrayList<>();
    private List<Items> candy = new ArrayList<>();

     HashMap<String, List> products = new HashMap<>();

    private HashMap<String, List> ItemsToProduct() {
        Items cola = new Items("Cola", 10, 2.0);
        Items pepsi = new Items("Pepsi", 10, 2.0);
        Items sprite = new Items("Sprite", 10, 1.8);
        drink.add(cola);
        drink.add(pepsi);
        drink.add(sprite);

        Items coys = new Items("Coys", 10, 2.0);
        Items pringles = new Items("Peringles", 10, 2.0);
        Items doritos = new Items("Doritos", 10, 1.8);
        chips.add(coys);
        chips.add(pringles);
        chips.add(doritos);

        Items snikers = new Items("Snikers", 10, 1.5);
        Items twix = new Items("Twix", 10, 1.4);
        Items kitkat = new Items("Kit-Kat", 10, 1.8);
        candy.add(snikers);
        candy.add(twix);
        candy.add(kitkat);


        products.put("A", drink);
        products.put("B", chips);
        products.put("C", candy);
        return products;
    }

    public List<Items> getDrink() {
        return drink;
    }

    public void setDrink(List<Items> drink) {
        this.drink = drink;
    }

    public List<Items> getChips() {
        return chips;
    }

    public void setChips(List<Items> chips) {
        this.chips = chips;
    }

    public List<Items> getCandy() {
        return candy;
    }

    public void setCandy(List<Items> candy) {
        this.candy = candy;
    }
}
