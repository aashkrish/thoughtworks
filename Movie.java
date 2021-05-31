package com.company;

import java.util.ArrayList;

public class Movie {
    String title;
    String studio;
    String rating;

    public Movie ( String title, String studio, String rating ) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie ( String title, String studio ) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public Movie[] getPG ( Movie movies[] ) {
        Movie PGMovies[] = new Movie[movies.length];
        int j = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.contains("PG")) {
                System.out.println(movies[i].title);
                PGMovies[j] = new Movie(movies[i].title,movies[i].studio,movies[i].rating);
                j++;
            }
        }
        return PGMovies;
    }

    public static void main ( String[] args ) {
        Movie movies[] = new Movie[4];

        movies[0] = new Movie("Casino Royale", "Eon Productions", "PG-13");
        movies[1] = new Movie("Harry Potter", "Warner Bros", "PG-13");
        movies[2] = new Movie("Legally Blonde", "Columbia Pictures", "PG-13");
        movies[3] = new Movie("Joker", "Warner Bros", "R");
        System.out.println(movies[0].getPG(movies).toString());
    }
}
