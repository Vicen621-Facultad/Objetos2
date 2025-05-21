package ar.edu.unlp.oo1.ejercicio1.logging;

import java.text.MessageFormat;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CensoringHandler extends Handler {
    private Handler delegate;
    private List<String> censoredWords;

    public CensoringHandler(Handler delegate, List<String> censoredWords) {
        this.delegate = delegate;
        this.censoredWords = censoredWords;
    }

    @Override
    public void publish(LogRecord record) {
        if (!isLoggable(record)) return;

        String message = record.getMessage();
        for (String word : censoredWords) {
            message = message.replaceAll(MessageFormat.format("(?i)\\b{0}\\b", word), "***");
        }

        record.setMessage(message);
        delegate.publish(record);
    }

    @Override
    public void flush() {
        delegate.flush();
    }

    @Override
    public void close() throws SecurityException {
        delegate.close();
    }
}
