package io.github.vicen621.publication;

public class Retweet implements Publication {
    private Tweet originalTweet;

    public Retweet(Tweet originalTweet) {
        this.originalTweet = originalTweet;
    }

    @Override
    public String getText() {
        return this.originalTweet.getText();
    }

    @Override
    public String getCreator() {
        return this.originalTweet.getCreator();
    }

    public Tweet getOriginalTweet() {
        return originalTweet;
    }
}
