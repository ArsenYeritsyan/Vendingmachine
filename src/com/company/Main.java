package com.company;

public class Main {

    public static void main(String[] args) throws VendingExceptions {

        Machine vending = new Machine();
        vending.acceptMoney(vending.getMoney());
        while (vending.getSelection()) {
            vending.convert(vending.selectComand());
        }
    }
}
