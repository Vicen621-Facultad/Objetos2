package io.github.vicen621.crc;

import java.util.zip.CRC32;

public class CRC32Calculator implements CRC {

    @Override
    public long crcFor(String data) {
        CRC32 crc = new CRC32();
        crc.update(data.getBytes());
        return crc.getValue();
    }
}
