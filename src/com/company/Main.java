package com.company;

public class Main {

    public static void main(String[] args) throws VendingExceptions {

        Machine vending = new Machine();
        vending.acceptMoney(vending.getMoney());
        try {
            vending.getProduct(Converter.convertInputToCommand("A:3"));
            vending.showCountityOfProducts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
