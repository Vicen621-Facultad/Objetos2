package io.github.vicen621;

import io.github.vicen621.publication.Retweet;
import io.github.vicen621.publication.Tweet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetweetTest {
    private Retweet retweet;
    private Tweet originalTweet;

    @BeforeEach
    public void setup() {
        originalTweet = new Tweet("test");
        retweet = new Retweet(originalTweet);
    }

    @Test
    public void test_getText() {
        assertEquals(retweet.getText(), originalTweet.getText());
    }

    @Test
    public void test_getOriginalTweet() {
        assertEquals(retweet.getOriginalTweet(), originalTweet);
    }
}
