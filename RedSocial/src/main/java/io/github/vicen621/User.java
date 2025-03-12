package io.github.vicen621;

import io.github.vicen621.publication.Publication;
import io.github.vicen621.publication.Retweet;
import io.github.vicen621.publication.Tweet;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String screenName;
    private List<Publication> publications;

    public User(String screenName) {
        this.screenName = screenName;
        this.publications = new ArrayList<>();
    }

    /**
     * Crea un tweet
     * @param text El texto del tweet
     * @return True si el tweet se creo con exito. False si el texto ingresado no cumple con los requisitos
     */
    public boolean postTweet(String text) {
        if (!checkLength(text))
            return false;

        Tweet tweet = new Tweet(text);
        publications.add(tweet);
        return true;
    }

    /**
     * Crea un retweet
     * @param tweet El tweet original
     */
    public void postRetweet(Tweet tweet) {
        Retweet retweet = new Retweet(tweet);
        publications.add(retweet);
    }

    /**
     * Borra todos los tweets del usuario
     */
    public void deleteTweets() {
        this.publications.clear();
    }

    public String getScreenName() {
        return screenName;
    }

    /**
     * Verifica que el texto tenga entre 1 y 280 caracteres
     * @param text El texto a verificar
     * @return true si el texto tiene entre 1 y 280 caracters, falso en caso contrario
     */
    private boolean checkLength(String text) {
        return !text.isEmpty() && text.length() <= 280;
    }
}
