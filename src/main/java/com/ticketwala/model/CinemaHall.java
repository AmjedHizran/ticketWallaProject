package com.ticketwala.model;

import java.util.Arrays;

public class CinemaHall {
    private int row;
    private int culomn;

    private Seat[][] seatsArray;

    public CinemaHall(int row, int column, double price) {
        this.row = row;
        this.culomn = column;
        this.seatsArray = new Seat[row][column];
        initSeats(price);
    }

    public Seat[][] getSeatsArray() {
        return seatsArray;
    }


    private void initSeats(double price) {
        for (int rows = 0; rows < this.row; rows ++)
            for (int col = 0; col < this.culomn; col++)
                this.seatsArray[rows][col] = new Seat(rows + 1,col + 1,false,price);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int rows = 0; rows < this.seatsArray.length; rows++) {
            for (int col = 0; col < this.seatsArray[rows].length; col++) {
                if (seatsArray[rows][col].isSold()) {
                    res.append("X");
                } else {
                    res.append("O");
                }
            }
            res.append("\n");
        }


        return res.toString();
    }

    public void updateSeat(Seat newSeat){
        seatsArray[newSeat.getRow() - 1][newSeat.getSeatNumber() - 1] = newSeat;
    }

}
