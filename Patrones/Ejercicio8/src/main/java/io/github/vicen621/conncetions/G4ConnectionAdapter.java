package io.github.vicen621.conncetions;

public class G4ConnectionAdapter implements Connection {
    private G4Connection g4;

    public G4ConnectionAdapter(G4Connection g4) {
        this.g4 = g4;
    }

    @Override
    public String sendData(String data, long crc) {
        return g4.transmit(data, crc);
    }

    @Override
    public String pict() {
        return g4.symb();
    }
}
