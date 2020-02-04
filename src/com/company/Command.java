package com.company;

public class Command {
    private  String row;
    private int collumn;

    public Command() {
    }

    public Command(String row, int collumn) {
        this.row = row;
        this.collumn = collumn;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public int getCollumn() {
        return collumn;
    }

    public void setCollumn(int collumn) {
        this.collumn = collumn;
    }
}
