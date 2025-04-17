package io.github.vicen621.ejercicio5.strategies;

import io.github.vicen621.ejercicio5.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimilaritySuggestionStrategy extends SuggestionStrategy {

    protected Stream<Movie> getMovies(List<Movie> movies, List<Movie> watchedMovies){
        return watchedMovies.stream()
                .flatMap(movie -> movie.getSimilarMovies().stream());
    }

    protected Comparator<Movie> comparator() {
        return Comparator.comparingInt(Movie::getYear).reversed();
    }

}
