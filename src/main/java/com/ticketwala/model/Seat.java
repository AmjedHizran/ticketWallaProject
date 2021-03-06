package com.ticketwala.model;

public class Seat {

    private int row;
    private int seatNumber;
    private boolean sold = false;
    private double price;

    public Seat(int row, int seatNumber, boolean sold, double price) {
        this.row = row;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public int getRow() {
        return row;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isSold() {
        return sold;
    }

    public double getPrice() {
        return price;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
