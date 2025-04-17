package io.github.vicen621.ejercicio5.strategies;

import io.github.vicen621.ejercicio5.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RatingSuggestionStrategy extends SuggestionStrategy {

    protected Comparator<Movie> comparator() {
        return Comparator.comparingDouble(Movie::getRating).thenComparingInt(Movie::getYear).reversed();
    }
}
