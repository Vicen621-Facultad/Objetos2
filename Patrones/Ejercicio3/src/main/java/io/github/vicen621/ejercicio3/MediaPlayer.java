package io.github.vicen621.ejercicio3;

import io.github.vicen621.ejercicio3.media.Media;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    private List<Media> media;

    public MediaPlayer() {
        this.media = new ArrayList<>();
    }

    public void addMedia(Media mediaAdd) {
        media.add(mediaAdd);
    }

    public void play() {
        media.forEach(Media::play);
    }
}
