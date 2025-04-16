package io.github.vicen621.ejercicio5;

import io.github.vicen621.ejercicio5.strategies.NoveltySuggestionStrategy;
import io.github.vicen621.ejercicio5.strategies.SuggestionStrategy;

import java.util.ArrayList;
import java.util.List;

public class Decoder {
    private SuggestionStrategy strategy;
    private List<Movie> watchedMovies;
    private List<Movie> movies;

    public Decoder() {
        this.strategy = new NoveltySuggestionStrategy();
        this.watchedMovies = new ArrayList<>();
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void addWatchedMovie(Movie movie) {
        this.watchedMovies.add(movie);
    }

    public List<Movie> getSuggestions() {
        return this.strategy.suggestMovies(this.movies, this.watchedMovies);
    }

    public void setStrategy(SuggestionStrategy strategy) {
        this.strategy = strategy;
    }
}
