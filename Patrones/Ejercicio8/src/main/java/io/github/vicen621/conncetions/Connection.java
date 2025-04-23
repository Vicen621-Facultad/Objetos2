package io.github.vicen621.conncetions;

public interface Connection {
    String sendData(String data, long crc);
    String pict();
}
