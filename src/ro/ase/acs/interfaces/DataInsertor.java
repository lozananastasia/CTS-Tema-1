package ro.ase.acs.interfaces;

import java.sql.Connection;

public interface DataInsertor {
    void inserData(Connection connection) throws Exception;
}