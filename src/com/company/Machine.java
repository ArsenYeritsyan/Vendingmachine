package com.company;

import java.util.Scanner;

public class Machine extends ProductsInCell {

    private double money = 0.0;
    private String command = "";
    private boolean selection = true;

    public Machine() {
        super();
    }

    public void convert(String comand) throws VendingExceptions{
        String[] comandString = command.split(":");
        String row = comandString[0].toUpperCase();
        int column = Integer.parseInt(comandString[1]);
        VendingExceptions.testItem(row, column);
        this.selection=false;
        System.out.println("Take it" + getProducts().get(row).get(column - 1).getName());
        getProducts().get(row).get(column - 1).itemCount();
        this.money-=getProducts().get(row).get(column - 1).getCost();
        System.out.println("Take your cash back :"+ this.money);

    }

    String selectComand() {
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
