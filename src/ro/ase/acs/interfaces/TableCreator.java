package ro.ase.acs.interfaces;

import java.sql.Connection;

public interface TableCreator {
    void createTable(Connection connection) throws Exception;
}
