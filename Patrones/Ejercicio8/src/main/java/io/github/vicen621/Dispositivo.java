package io.github.vicen621;

import io.github.vicen621.conncetions.Connection;
import io.github.vicen621.crc.CRC;

public class Dispositivo {

    private CRC crcCalculator;
    private Ringer ringer;
    private Connection connection;
    private Display display;

    public Dispositivo(CRC crcCalculator, Ringer ringer, Connection connection, Display display) {
        this.crcCalculator = crcCalculator;
        this.ringer = ringer;
        this.connection = connection;
        this.display = display;
    }

    public String send(String data) {
        long crc = this.crcCalculator.crcFor(data);
        return this.connection.sendData(data, crc);
    }

    public String concectarCon(Connection connection) {
        this.connection = connection;
        StringBuilder output = new StringBuilder();
        output.append(display.showBanner(connection.pict()));
        output.append(ringer.ring());
        return output.toString();
    }

    public void configurarCRC(CRC crcCalculator) {
        this.crcCalculator = crcCalculator;
    }
}
