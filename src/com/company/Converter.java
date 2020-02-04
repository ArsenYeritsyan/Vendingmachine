package com.company;

public class Converter {
    public static Command convertInputToCommand(String input) throws Exception {

        String[] split = input.split(":");
        return new Command(split[0], Integer.parseInt(split[1]));
    }
}
