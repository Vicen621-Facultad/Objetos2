package io.github.vicen621;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class DatabaseProxy implements DatabaseAccess {
    private DatabaseRealAccess database;
    private Authenticator authenticator;

    private static final Logger logger = Logger.getLogger(DatabaseProxy.class.getName());

    public DatabaseProxy(DatabaseRealAccess database, Authenticator authenticator) {
        this.database = database;
        this.authenticator = authenticator;
    }

    private boolean checkAccess() {
        return authenticator.isAuthenticated();
    }


    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (!checkAccess()) {
            logger.severe("No tenes acceso a la database");
            return null;
        }

        Collection<String> searchResults = database.getSearchResults(queryString);
        logger.info("Acceso valido para busquedas");
        return searchResults;
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (!checkAccess()) {
            logger.severe("No tenes acceso a la database");
            return -1;
        }

        int result = database.insertNewRow(rowData);
        logger.warning("Acceso valido para inserciones");
        return result;
    }
}
