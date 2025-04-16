package io.github.vicen621.ejercicio5.strategies;

import io.github.vicen621.ejercicio5.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SimilaritySuggestionStrategy implements SuggestionStrategy {
    @Override
    public List<Movie> suggestMovies(List<Movie> movies, List<Movie> watchedMovies) {
        return watchedMovies.stream()
                .flatMap(movie -> movie.getSimilarMovies().stream()) // Agarro todas las peliculas similares
                .filter(movie -> !watchedMovies.contains(movie)) // Saco todas las que ya se vieron
                .sorted(Comparator.comparingInt(Movie::getYear).reversed()) // Las ordeno por año (mayor a menor)
                .limit(3) // agarro solo las 3 primeras
                .collect(Collectors.toList());
    }
}
