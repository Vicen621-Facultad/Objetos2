package ar.edu.unlp.oo1.ejercicio1.app;

import ar.edu.unlp.oo1.ejercicio1.logging.JsonFormatter;
import ar.edu.unlp.oo1.ejercicio1.logging.MailHandler;
import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

import javax.swing.*;
import java.io.IOException;
import java.util.logging.*;

public class Ejercicio1Application {

    public static void main(String[] args) throws SecurityException, IOException {
		Logger modelLogger = Logger.getLogger("wallpost.model");
		modelLogger.setUseParentHandlers(false); // Evita que también imprima en consola

		MailHandler mailHandler = new MailHandler("vicentegarciamarti@gmail.com");
		mailHandler.setFormatter(new SimpleFormatter());
		mailHandler.setLevel(Level.ALL);

		modelLogger.addHandler(mailHandler);

		// Logger de la vista
		Logger uiLogger = Logger.getLogger("wallpost.ui");
		uiLogger.setUseParentHandlers(false);

		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setFormatter(new JsonFormatter());
		consoleHandler.setLevel(Level.INFO);

		uiLogger.addHandler(consoleHandler);
		uiLogger.setLevel(Level.INFO);

		uiLogger.info("Iniciando la aplicación...");
        SwingUtilities.invokeLater(WallPostUI::new);
    }

}
