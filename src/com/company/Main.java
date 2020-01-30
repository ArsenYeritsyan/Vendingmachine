package com.company;

public class Main {

    public static void main(String[] args) throws VendingExceptions {

        Machine vending = new Machine();
        vending.start();
        vending.showCountityOfProducts();

    }
}
