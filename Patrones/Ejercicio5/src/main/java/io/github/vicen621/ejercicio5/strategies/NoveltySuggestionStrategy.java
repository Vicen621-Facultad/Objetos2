package io.github.vicen621.ejercicio5.strategies;

import io.github.vicen621.ejercicio5.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NoveltySuggestionStrategy implements SuggestionStrategy {
    @Override
    public List<Movie> suggestMovies(List<Movie> movies, List<Movie> watchedMovies) {
        return movies.stream()
                .filter(movie -> !watchedMovies.contains(movie)) // Saco las peliculas vistas
                .sorted(Comparator.comparingInt(Movie::getYear).reversed()) // las ordeno de mas recientes a mas viejas
                .limit(3)
                .collect(Collectors.toList());
    }
}
