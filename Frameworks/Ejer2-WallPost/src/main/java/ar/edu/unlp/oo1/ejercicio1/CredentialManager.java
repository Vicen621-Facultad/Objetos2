package ar.edu.unlp.oo1.ejercicio1;

import java.io.IOException;
    import java.io.InputStream;
    import java.util.Properties;

    public class CredentialManager {
        private static final Properties properties = new Properties();

        static {
            try (InputStream input = CredentialManager.class.getClassLoader().getResourceAsStream("credentials.properties")) {
                properties.load(input);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static String getProperty(String key) {
            return properties.getProperty(key);
        }
    }