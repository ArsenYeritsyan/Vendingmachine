package com.company;

import com.company.Items.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Machine {
    private List<ItemsQueue> drink = new ArrayList<>();
    private List<ItemsQueue> chips = new ArrayList<>();
    private List<ItemsQueue> candy = new ArrayList<>();
    private  HashMap<String, List<ItemsQueue>> products = new HashMap<>();

    private double money = 0.0;
    private String command = "";
    private boolean selection = true;
    Item itemTemp;

    public Machine(){
        initializeProducts();
        showProducts();
    }


    private void initializeProducts() {

        products.put("A", drink);
        products.put("B", chips);
        products.put("C", candy);

        drink.add(new ItemsQueue(new Cola("Cola", 1.9)));
        drink.add(new ItemsQueue(new Pepsi("Pepsi", 2.0)));
        drink.add(new ItemsQueue(new Sprite("Sprite", 1.8)));

        chips.add(new ItemsQueue(new Coys("Coys", 2.2)));
        chips.add(new ItemsQueue(new Pringles("Pringles", 2.0)));
        chips.add(new ItemsQueue(new Doritos("Doritos", 1.8)));

        candy.add(new ItemsQueue(new Snikers("Snikers", 1.5)));
        candy.add(new ItemsQueue(new Twix("Twix", 1.4)));
        candy.add(new ItemsQueue(new KitKat("Kit-Kat", 1.7)));
    }

    public Item getProduct(Command command) {
        String row = command.getRow();
        int column = command.getCollumn();
        try {
            boolean b = getProducts().containsKey(row);
            getProducts().get(row).get(column - 1).removeFirst();
            itemTemp = getProducts().get(row).get(column - 1).getItem();
           // getProducts().get(row).get(column - 1).getProductCountity();
            System.out.println(itemTemp.getClass() + " " + itemTemp.getCost());

            this.money -= itemTemp.getCost();
            System.out.println("Take your cash back :" + this.money);
            return itemTemp;

        } catch (NullPointerException e) {
            System.out.println("hehe");
        }return itemTemp;
    }

    String scanInputCommand() {
        System.out.println("Select your choise.");
        Scanner scanner = new Scanner(System.in);
        this.command = scanner.nextLine();
        System.out.println("Getting comand");
        return this.command;
    }

    double acceptMoney(double money) {
        System.out.println("Input money.");
        Scanner scanner = new Scanner(System.in);
        double inputCoin = scanner.nextDouble();
        this.money += inputCoin;
        System.out.println("you have " + this.money + " money ");
        return this.money;
    }

    void showProducts() {
        for (int i = 0; i < getDrink().size(); i++) {
            System.out.println(getDrink().get(i).getItem().getClass()+" " + getDrink().get(i).getProductCountity());
        }
        for (int i = 0; i < getCandy().size(); i++) {
            System.out.println(getCandy().get(i).getItem().getClass()+" " + getCandy().get(i).getProductCountity());
        }
        for (int j = 0; j < getChips().size(); j++) {
            System.out.println(getChips().get(j).getItem().getClass()+" " + getChips().get(j).getProductCountity());
        }
    }


    public List<ItemsQueue> getDrink() {
        return drink;
    }

    public void setDrink(List<ItemsQueue> drink) {
        this.drink = drink;
    }

    public List<ItemsQueue> getChips() {
        return chips;
    }

    public void setChips(List<ItemsQueue> chips) {
        this.chips = chips;
    }

    public List<ItemsQueue> getCandy() {
        return candy;
    }

    public void setCandy(List<ItemsQueue> candy) {
        this.candy = candy;
    }

    public HashMap<String, List<ItemsQueue>> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, List<ItemsQueue>> products) {
        this.products = products;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public boolean isSelection() {
        return selection;
    }

    public void setSelection(boolean selection) {
        this.selection = selection;
    }
}
