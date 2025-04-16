package io.github.vicen621.ejercicio5.strategies;

import io.github.vicen621.ejercicio5.Movie;

import java.util.List;

public interface SuggestionStrategy {
    List<Movie> suggestMovies(List<Movie> movies, List<Movie> watchedMovies);
}
