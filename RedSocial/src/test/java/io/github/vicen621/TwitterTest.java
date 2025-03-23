package io.github.vicen621;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TwitterTest {
    private Twitter twitter;

    @BeforeEach
    public void setup() {
        twitter = new Twitter();
    }

    @Test
    public void test_addUser_success() {
        User user = twitter.addUser("test");
        assertNotNull(user);
    }

    @Test
    public void test_addUser_fail() {
        twitter.addUser("test");
        User userNull = twitter.addUser("test");
        assertNull(userNull);
    }
}
