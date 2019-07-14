package com.ticketwala.model;

public class Order {
    private String id;
    private MovieShow movieShow;
    private Seat[] seats;

    public Order(String id, MovieShow movieShow, Seat[] seats) {
        this.id = id;
        this.movieShow = movieShow;
        this.seats = seats;
    }

    public String getId() {
        return id;
    }

    public MovieShow getMovieShow() {
        return movieShow;
    }

    public Seat[] getSeats() {
        return seats;
    }
}
