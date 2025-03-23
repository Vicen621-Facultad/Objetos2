package io.github.vicen621;

import io.github.vicen621.publication.Tweet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user;

    @BeforeEach
    public void setup() {
        user = new User("test");
    }

    @Test
    public void test_postTweet_success() {
        assertTrue(user.postTweet("test"));
        assertEquals(1, user.getPublications().size());
    }

    @Test
    public void test_postTweet_fail_no_chars() {
        assertFalse(user.postTweet(""));
        assertEquals(0, user.getPublications().size());
    }

    @Test
    public void test_postTweet_fail_more_than_280_chars() {
        assertFalse(user.postTweet("uqmzaljynswvagxlpokakfphamueupemallqllnupkrqqlqjoavsxacmjqylabwvumklyjbqgqtqmcicjsvbtwtujnwnjdzthjboeminqtworcirvescvqryhshsmbybwawxjkogxuaqulsetkzvduwkeecyodfyucylxgghtzoheyxmsxrqcluylnrvncaicumufpikhctahtzndteretnvswlukcviyjxbngwsblkcnwxzkgmcnqewivyoyfoqdfhytfcdoedvgbpttpcclweum"));
        assertEquals(0, user.getPublications().size());
    }

    @Test
    public void test_postRetweet() {
        Tweet tweet = new Tweet("asd", "test");
        user.postRetweet(tweet);
        assertEquals(1, user.getPublications().size());
    }

    @Test
    public void test_deleteRetweetsFromUser() {
        User other = new User("test");
        Tweet tweet = new Tweet("asd", "test");
        user.postRetweet(tweet);
        assertEquals(1, user.getPublications().size());
        user.deleteRetweetsFromUser(other);
        assertEquals(0, user.getPublications().size());
    }
}
