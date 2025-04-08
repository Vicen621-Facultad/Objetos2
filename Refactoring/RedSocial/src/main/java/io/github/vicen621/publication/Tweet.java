package io.github.vicen621.publication;

public class Tweet implements Publication {
    private String text;
    private String creator;

    public Tweet(String text, String creator) {
        this.text = text;
        this.creator = creator;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public String getCreator() {
        return this.creator;
    }


}
