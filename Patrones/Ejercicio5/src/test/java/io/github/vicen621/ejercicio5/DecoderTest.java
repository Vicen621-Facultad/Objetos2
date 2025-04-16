package io.github.vicen621.ejercicio5;

import io.github.vicen621.ejercicio5.strategies.NoveltySuggestionStrategy;
import io.github.vicen621.ejercicio5.strategies.RatingSuggestionStrategy;
import io.github.vicen621.ejercicio5.strategies.SimilaritySuggestionStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class DecoderTest {
    private Decoder decoder;
    private Movie thor = new Movie("Thor", 2007, 7.9);
    private Movie capitanAmerica = new Movie("Capitan America", 2016, 7.8);
    private Movie ironMan = new Movie("Iron Man", 2010, 7.9);
    private Movie dunkirk = new Movie("Dunkirk", 2017, 7.9);
    private Movie rocky = new Movie("Rocky", 1976, 8.1);
    private Movie rambo = new Movie("Rambo", 1979, 7.8);

    @BeforeEach
    public void setup() {
        thor.addSimilarMovie(capitanAmerica);
        thor.addSimilarMovie(ironMan);

        capitanAmerica.addSimilarMovie(thor);
        capitanAmerica.addSimilarMovie(ironMan);

        ironMan.addSimilarMovie(thor);
        ironMan.addSimilarMovie(capitanAmerica);

        rocky.addSimilarMovie(rambo);
        rambo.addSimilarMovie(rocky);

        decoder = new Decoder();

        decoder.addMovie(thor);
        decoder.addMovie(capitanAmerica);
        decoder.addMovie(ironMan);
        decoder.addMovie(dunkirk);
        decoder.addMovie(rocky);
        decoder.addMovie(rambo);

        decoder.addWatchedMovie(thor);
        decoder.addWatchedMovie(rocky);

    }

    @Test
    public void testCaseCuadernillo() {
        decoder.setStrategy(new SimilaritySuggestionStrategy());
        List<Movie> sugeridas = decoder.getSuggestions();

        assertIterableEquals(
                List.of(capitanAmerica, ironMan, rambo),
                sugeridas
        );

        decoder.setStrategy(new RatingSuggestionStrategy());
        sugeridas = decoder.getSuggestions();
        assertIterableEquals(
                List.of(dunkirk, ironMan, capitanAmerica),
                sugeridas
        );
    }

    @Test
    public void testNoveltySuggestionStrategy() {
        decoder.setStrategy(new NoveltySuggestionStrategy());

        List<Movie> sugeridas = decoder.getSuggestions();

        assertIterableEquals(
                List.of(dunkirk, capitanAmerica, ironMan),
                sugeridas
        );
    }

    @Test
    public void testSimilaritySuggestionStrategy() {
        decoder.setStrategy(new SimilaritySuggestionStrategy());

        List<Movie> sugeridas = decoder.getSuggestions();

        assertIterableEquals(
                List.of(capitanAmerica, ironMan, rambo),
                sugeridas
        );
    }

    @Test
    public void testRatingSuggestionStrategy() {
        decoder.setStrategy(new RatingSuggestionStrategy());

        List<Movie> sugeridas = decoder.getSuggestions();

        assertIterableEquals(
                List.of(dunkirk, ironMan, capitanAmerica),
                sugeridas
        );
    }

}
