package io.github.vicen621.conncetions;

public class WifiConn implements Connection {
    private String pict;

    public WifiConn(String pict) {
        this.pict = pict;
    }

    @Override
    public String sendData(String data, long crc) {
        return "Wifi: " + data + " - CRC: " + crc;
    }

    @Override
    public String pict() {
        return this.pict;
    }
}
