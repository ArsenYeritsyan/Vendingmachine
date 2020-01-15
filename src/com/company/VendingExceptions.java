package com.company;

import java.io.IOException;

public class VendingExceptions extends Exception {
    private String row;
    private int column;

    public VendingExceptions(Throwable cause) {
        super(cause);
    }

    public VendingExceptions(Exception ex) {
        super(ex);
    }

    static void testItem(String row, int column) throws NullPointerException, IndexOutOfBoundsException {
        try {
            Items items = Machine.getProducts().get(row).get(column - 1);
            System.out.println("Trying");
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException caught...");
            throw new NullPointerException();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.print("ArrayIndexOutOfBoundsException caught");
            throw new IndexOutOfBoundsException();
        }

    }
    // static void
}


