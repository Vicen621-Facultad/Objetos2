package ar.edu.unlp.oo1.ejercicio1.logging;

import ar.edu.unlp.oo1.ejercicio1.CredentialManager;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MailHandler extends Handler {
    private String to;

    public MailHandler(String to) {
        this.to = to;
    }

    @Override
    public void publish(LogRecord record) {
        String message = record.getMessage();
        String level = record.getLevel().toString();
        String loggerName = record.getLoggerName();

        // Lo mando async para no parar el Main Thread
        new Thread(() -> {
            this.sendMail(loggerName + ": " + level, message);
        }).start();
    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }

    private void sendMail(String subject, String body) {
        try {
            String from = "example@logger.com";

            // credenciales
            String username = CredentialManager.getProperty("mail.user"); // Completar con su username de mailtrap
            String password = CredentialManager.getProperty("mail.password"); // Completar con su password de mailtrap

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.mailtrap.io");
            props.put("mail.smtp.port", "587");
            Session session = Session.getInstance(props,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from, "Java logging mail"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);
            Transport.send(message);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
