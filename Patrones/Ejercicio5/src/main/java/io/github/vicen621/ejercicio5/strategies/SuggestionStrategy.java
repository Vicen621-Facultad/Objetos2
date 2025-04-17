package io.github.vicen621.ejercicio5.strategies;

import io.github.vicen621.ejercicio5.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class SuggestionStrategy {
    private final static int LIMIT_RESULTS = 3;

    public List<Movie> suggestMovies(List<Movie> movies, List<Movie> watchedMovies) {
        return this.getMovies(movies, watchedMovies)
                .filter(movie -> !watchedMovies.contains(movie))
                .sorted(this.comparator())
                .limit(LIMIT_RESULTS)
                .collect(Collectors.toList());
    }

    protected Stream<Movie> getMovies(List<Movie> movies, List<Movie> watchedMovies){
        return movies.stream();
    }

    protected abstract Comparator<Movie> comparator();
}
