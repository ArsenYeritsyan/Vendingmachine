package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Machine extends ProductsInCell {
    private static HashMap<String, List> products;
    private double money = 0.0;
    private String comand;

    public double getMoney() {
        return money;
    }

    public void Converter(String comand) {
        String[] comandString = comand.split(":");
        String row = comandString[0];
        int column = Integer.parseInt(comandString[1]);

        if (Machine.getProducts().containsKey(row)) {
            System.out.println(Machine.getProducts().get(row).get(column - 1));
            System.out.println(Machine.getProducts().get(row) + "111111");
            //Machine.getProducts().get(row).get(column-1).
        }
        //else(Exception
    }

    public String Comand() {
        System.out.println("Select your choise.");
        Scanner scanner = new Scanner(System.in);
        this.comand = scanner.nextLine();
        System.out.println("Getting comand");
        return this.comand;
    }

    public double AcceptMoney(double money) {
        System.out.println("Input money.");
        Scanner scanner = new Scanner(System.in);
        double inputCoin = scanner.nextDouble();
        this.money += inputCoin;
        System.out.println("you have" + this.money + " ");
        return this.money;
    }

    public static HashMap<String, List> getProducts() {
        return products;
    }

    public static void setProducts(HashMap<String, List> products) {
        Machine.products = products;
    }
}







    /*FlyingBirds flyingBirds= new FlyingBirds();
    ArrayList<Flyible>flyingAnimals=new ArrayList <>() ;
        flyingAnimals.add(flyingBirds);*/
