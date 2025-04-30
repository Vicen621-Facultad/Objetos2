package io.github.vicen621;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess {
    private DatabaseRealAccess database;

    public DatabaseProxy(DatabaseRealAccess database) {
        this.database = database;
    }

    //TODO: Hacer el login
    private boolean checkAccess() {
        return false;
    }


    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (!checkAccess()) {
            throw new RuntimeException("No tenes acceso a la database");
        }

        return database.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (!checkAccess()) {
            throw new RuntimeException("No tenes acceso a la database");
        }

        return database.insertNewRow(rowData);
    }
}
