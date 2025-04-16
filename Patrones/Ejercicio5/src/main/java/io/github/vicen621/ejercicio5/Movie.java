package io.github.vicen621.ejercicio5;

import java.util.ArrayList;
import java.util.List;

// DataClass
public class Movie {
    public String name;
    public int year;
    public double rating;
    public List<Movie> similarMovies;

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
        this.similarMovies = new ArrayList<>();
    }

    public void addSimilarMovie(Movie movie) {
        this.similarMovies.add(movie);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public List<Movie> getSimilarMovies() {
        return similarMovies;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", this.name, this.year);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Movie) {
            Movie movie = (Movie) obj;
            return this.name.equals(movie.name) && this.year == movie.year && this.rating == movie.rating;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.year + (int) this.rating;
    }
}
