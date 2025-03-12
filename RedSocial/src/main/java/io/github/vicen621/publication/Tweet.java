package io.github.vicen621.publication;

public class Tweet implements Publication {
    private String text;

    public Tweet(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return this.text;
    }
}
