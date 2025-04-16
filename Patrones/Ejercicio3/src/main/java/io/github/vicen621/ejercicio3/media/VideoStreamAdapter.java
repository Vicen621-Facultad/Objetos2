package io.github.vicen621.ejercicio3.media;

public class VideoStreamAdapter implements Media{
    private VideoStream videoStream;

    public VideoStreamAdapter(VideoStream videoStream) {
        this.videoStream = videoStream;
    }

    @Override
    public void play() {
        this.videoStream.reproduce();
    }
}
