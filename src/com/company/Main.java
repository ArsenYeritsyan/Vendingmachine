package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        Machine vending = new Machine();
        vending.acceptMoney(16.0);
      try {
          System.out.println(vending.getProduct(Converter.convertInputToCommand("A:3")).toString());
          vending.showProducts();
      }catch (Exception e) {
          System.out.println(e.getMessage());
      }
    }
}
