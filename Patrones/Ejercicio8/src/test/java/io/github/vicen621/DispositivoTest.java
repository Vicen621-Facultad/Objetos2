package io.github.vicen621;

import io.github.vicen621.conncetions.G4Connection;
import io.github.vicen621.conncetions.G4ConnectionAdapter;
import io.github.vicen621.conncetions.WifiConn;
import io.github.vicen621.crc.CRC16Calculator;
import io.github.vicen621.crc.CRC32Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DispositivoTest {
    private Dispositivo dispositivo;

    @BeforeEach
    public void setUp() {
        dispositivo = new Dispositivo(new CRC16Calculator(), new Ringer(), new WifiConn("wifi"), new Display());
    }

    @Test
    public void test_conectarCon_4g() {
        String output = dispositivo.concectarCon(new G4ConnectionAdapter(new G4Connection("4G")));

        assertTrue(output.contains("4G"));
        assertTrue(output.contains("Ringing..."));
    }

    @Test
    public void test_conectarCon_wifi() {
        String output = dispositivo.concectarCon(new WifiConn("wifi"));

        assertTrue(output.contains("wifi"));
        assertTrue(output.contains("Ringing..."));
    }

    @Test
    public void test_send() {
        String output = dispositivo.send("hola");
        System.out.println(output);
        assertTrue(output.contains("Wifi: hola"));
        assertTrue(output.contains("CRC: "));
    }

    @Test
    public void test_configurarCRC() {
        dispositivo.configurarCRC(new CRC32Calculator());
        String output = dispositivo.send("hola");
        System.out.println(output);
        assertTrue(output.contains("1872820616"));
    }
}
