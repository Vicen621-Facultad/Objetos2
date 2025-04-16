package io.github.vicen621.ejercicio5.strategies;

import io.github.vicen621.ejercicio5.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RatingSuggestionStrategy implements SuggestionStrategy {
    @Override
    public List<Movie> suggestMovies(List<Movie> movies, List<Movie> watchedMovies) {
        return movies.stream()
                .filter(movie -> !watchedMovies.contains(movie)) // Saco las peliculas que ya se vieron
                .sorted(
                        Comparator.comparingDouble(Movie::getRating) // Ordeno por puntaje (mayor a menor)
                                .thenComparingInt(Movie::getYear).reversed() // Ordeno por año (mayor a menor)
                )
                .limit(3)
                .collect(Collectors.toList());
    }
}
