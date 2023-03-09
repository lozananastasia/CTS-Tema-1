package ro.ase.acs.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMan {
    Connection getConnection() throws ClassNotFoundException, SQLException;
}