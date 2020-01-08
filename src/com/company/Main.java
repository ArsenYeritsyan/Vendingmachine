package com.company;

public class Main {

    public static void main(String[] args) {

        Machine vending = new Machine();
        vending.AcceptMoney(vending.getMoney());
        vending.Converter(vending.Comand());

    }
}












/* Machine airportVending = new Machine();

        airportVending.menu.put(new Integer(1), "Snickers");
        airportVending.menu.put(new Integer(2), "KitKat");
        airportVending.menu.put(new Integer(3), "DietCoke");
        airportVending.menu.put(new Integer(4), "Sprite");
        airportVending.menu.put(new Integer(5),"Skittles");
        airportVending.menu.put(new Integer(6),"Starbust");
        airportVending.menu.put(new Integer(7),"Muffin");
        ArrayList<String> items=new ArrayList<String>();




    }
}
