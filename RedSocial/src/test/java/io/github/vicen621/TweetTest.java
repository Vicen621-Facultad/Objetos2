package io.github.vicen621;

import io.github.vicen621.publication.Tweet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TweetTest {
    private Tweet tweet;

    @BeforeEach
    public void setup() {
        tweet = new Tweet("test");
    }

    @Test
    public void test_getText() {
        assertEquals(tweet.getText(), "test");
    }
}
