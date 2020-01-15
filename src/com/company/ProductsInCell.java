package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductsInCell {

    private static List<Items> drink = new ArrayList<>();
    private static List<Items> chips = new ArrayList<>();
    private static List<Items> candy = new ArrayList<>();
    private static HashMap<String, List<Items>> products = new HashMap<>();

    public ProductsInCell() {

        products.put("A", drink);
        products.put("B", chips);
        products.put("C", candy);

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

    public void setCandy() {
        this.candy = candy;
    }

    public static HashMap<String, List<Items>> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, List<Items>> products) {
        ProductsInCell.products = products;
    }
}
