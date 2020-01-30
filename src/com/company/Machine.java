package com.company;

import java.util.Scanner;

public class Machine extends ProductsInCell {

    private double money = 0.0;
    private String command = "";
    private boolean selection = true;

    public Machine() {
        super();
    }

    void start() {
        acceptMoney(getMoney());
        while (getSelection()) {
            convert(inputComand());
        }
    }

    void convert(String comand) throws VendingExceptions {
        String[] comandString = command.split(":");
        String row = comandString[0].toUpperCase();
        int column = Integer.parseInt(comandString[1]);
        this.selection = testItem(row, column);
        System.out.println("Take it" + getProducts().get(row).get(column - 1).getName());
        getProducts().get(row).get(column - 1).removeProduct();
        this.money -= getProducts().get(row).get(column - 1).getCost();
        System.out.println("Take your cash back :" + this.money);

    }

    String inputComand() {
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
        System.out.println("you have    " + this.money + " money ");
        return this.money;
    }

    boolean testItem(String row, int column) throws VendingExceptions {
        if (Machine.getProducts().containsKey(row) && Machine.getProducts().get(row).contains(column - 1)) {
            this.selection = false;
            System.out.println("Wait, please...");
        } else {
            System.out.println("Try Again");
            convert(inputComand());
            throw new NullPointerException();
        }
        return selection;
    }

    void showCountityOfProduct() {

    }

    public double getMoney() {
        return money;
    }

    public String getComand() {
        return command;
    }

    public void setComand(String command) {
        this.command = command;
    }

    public boolean getSelection() {
        return selection;
    }

    public void setSelection(boolean selection) {
        this.selection = selection;
    }
}
