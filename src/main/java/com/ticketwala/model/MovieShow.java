package com.ticketwala.model;

import java.sql.Time;

public class MovieShow {
    private String movieName;
    private String id;
    private CinemaHall cinemaHall;
    private Time time;
    private int duration;


    public MovieShow(String movieName, String id, CinemaHall cinemaHall, Time time, int duration) {
        this.movieName = movieName;
        this.id = id;
        this.cinemaHall = cinemaHall;
        this.time = time;
        this.duration = duration;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getId() {
        return id;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public Time getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }
}
