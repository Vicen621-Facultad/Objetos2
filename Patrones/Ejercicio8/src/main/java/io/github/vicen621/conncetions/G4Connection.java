package io.github.vicen621.conncetions;

public class G4Connection {
    private String symb;

    public G4Connection(String symb) {
        this.symb = symb;
    }

    public String transmit(String data, long crc) {
        return "4G: " + data + " - CRC: " + crc;
    }

    public String symb() {
        return this.symb;
    }
}
