package ar.edu.unlp.oo1.ejercicio1.logging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JsonFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return "{ \"message\": \"" + record.getMessage() + "\", \"level\": \"" + record.getLevel() + "\" }\n";
    }
}
